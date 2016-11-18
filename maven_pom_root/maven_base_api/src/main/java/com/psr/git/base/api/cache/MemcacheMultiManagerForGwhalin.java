package com.psr.git.base.api.cache;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.log4j.Logger;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;
import com.psr.git.base.api.exception.BaseClientException;

/**
 * 
 * <B> Function : </B> MemcacheMultiManagerForGwhalin <br>
 * <B> Description : </B> 缓存服务，多例模式 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月18日 下午5:59:11 <br>
 * @version v1.0
 *
 */
public class MemcacheMultiManagerForGwhalin {
	// 构建缓存客户端
	private static MemCachedClient cachedClient;
	// 多例模式实现客户端管理类
	private static Map<String, MemcacheMultiManagerForGwhalin> memMap = new ConcurrentHashMap<String, MemcacheMultiManagerForGwhalin>();
	private static String[] serverIP;
	private static Integer[] weights;
	private static int initConn = 5;
	private static int minConn = 5;
	private static int maxConn = 250;
	// 默认三小时
	private static int maxIdle = 1000 * 60 * 60 * 3;
	private static int maintSleep = 30;
	private static int socketTO = 3000;
	private static int socketConnectTO = 0;
	private static String LOCK_FLAG = "_mutex";
	private String memKey;
	
	protected static Logger LOGGER = Logger.getLogger(MemcacheMultiManagerForGwhalin.class); 
	
	/**
	 * 私有构造器
	 * @param memKey
	 */
	private MemcacheMultiManagerForGwhalin(String memKey){
		this.memKey = memKey;
	}
	
	public void init(){
		cachedClient = new MemCachedClient();
		// 获取链接池实例
		SockIOPool pool = SockIOPool.getInstance(memKey);
		
		// 设置缓存服务器地址，可以设置多个实现分布式缓存
		pool.setServers(serverIP);
		pool.setWeights(weights);
		// 设置初始连接5
		pool.setInitConn(initConn);
		// 设置最小连接5
		pool.setMinConn(minConn);
		// 设置最大连接250
		pool.setMaxConn(maxConn);
		// 设置每个连接最大空闲时间3小时
		pool.setMaxIdle(maxIdle);
		pool.setMaintSleep(maintSleep);
		pool.setNagle(false);
		pool.setSocketTO(socketTO);
		pool.setSocketConnectTO(socketConnectTO);
		pool.initialize();
		cachedClient.add("poolName", memKey);
	}
	
	/**
	 * 获取缓存管理唯一实例
	 * @param memKey
	 * @return
	 */
	public synchronized static MemcacheMultiManagerForGwhalin getInstance(String memKey){
		if(memMap.containsKey(memKey)){
			return memMap.get(memKey);
		}else {
			MemcacheMultiManagerForGwhalin gwhain = new MemcacheMultiManagerForGwhalin(memKey);
			memMap.put(memKey, gwhain);
			return gwhain;
		}
	}
	
	/**
	 * 新增缓存
	 * @param key 
	 * @param value 
	 * @return
	 */
	public boolean add(String key, Object value){
		return cachedClient.add(key, value);
	}
	
	/**
	 * 新增缓存
	 * @param key
	 * @param value
	 * @param expiry
	 * @return
	 */
	public boolean add(String key, Object value, Date expiry){
		return cachedClient.add(key, value, expiry);
	}
	
	/**
	 * 新增或更新缓存
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean addOrUpadate(String key, Object value){
		return cachedClient.set(key, value);
	}
	
	/**
	 * 新增或更新缓存
	 * @param key
	 * @param value
	 * @param expiry
	 * @return
	 */
	public boolean addOrUpdate(String key, Object value, Date expiry){
		return cachedClient.set(key, value, expiry);
	}
	
	/**
	 * 删除缓存
	 * @param key
	 * @return
	 */
	public boolean remove(String key){
		return cachedClient.delete(key);
	}
	
	/**
	 * 删除缓存
	 * @param key
	 * @param expiry
	 * @return
	 */
	@Deprecated
	public boolean remove(String key, Date expiry){
		return cachedClient.delete(key, expiry);
	}
	
	/**
	 * 更新缓存
	 * @param key
	 * @param value
	 * @param expiry
	 * @return
	 */
	public boolean update(String key, Object value){
		return cachedClient.replace(key, value);
	}
	
	/**
	 * 更新缓存
	 * @param key
	 * @param value
	 * @param expiry
	 * @return
	 */
	public boolean update(String key, Object value, Date expiry){
		return cachedClient.replace(key, value, expiry);
	}
	
	/**
	 * 获取缓存
	 * @param key
	 * @return
	 */
	public Object get(String key){
		return cachedClient.get(key);
	}
	
	/**
	 * 新增缓存 with lock
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean updateWithLock(String key, Object value){
		String lockKey = key + LOCK_FLAG;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 60);
		if(cachedClient.add(lockKey, 1, cal.getTime()) == true){
			boolean results;
			results = cachedClient.replace(key, value);
			cachedClient.delete(lockKey);
			return results;
		}else {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return false;
			}
			 return updateWithLock(lockKey, value);
		}
	}
	
	/**
	 * 新增缓存 with lock
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean updateWithLock(String key, Object value, Date expiry){
		String lockKey = key + LOCK_FLAG;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 60);
		if(cachedClient.add(lockKey, 1, cal.getTime()) == true){
			boolean results;
			results = cachedClient.replace(key, value, expiry);
			cachedClient.delete(lockKey);
			return results;
		}else {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return false;
			}
			 return updateWithLock(lockKey, value, expiry);
		}
	}
	
	/**
	 * 更新增量increase with lock
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean updateIncreaseWithLock(String key, int increase){
		String lockKey = key + LOCK_FLAG;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 60);
		if(cachedClient.add(lockKey, 1, cal.getTime()) == true){
			int oldValue = (Integer) cachedClient.get(key);
			boolean results = cachedClient.replace(key, oldValue + increase);
			cachedClient.delete(lockKey);
			return results;
		}else {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return false;
			}
			return updateIncreaseWithLock(lockKey, increase);
		}
	}
	
	/**
	 * 更新增量increase with lock
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean updateIncreaseWithLock(String key, int increase, Date expiry){
		String lockKey = key + LOCK_FLAG;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 60);
		if(cachedClient.add(lockKey, 1, cal.getTime()) == true){
			int oldValue = (Integer) cachedClient.get(key);
			boolean results = cachedClient.replace(key, oldValue + increase, expiry);
			cachedClient.delete(lockKey);
			return results;
		}else {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return false;
			}
			 return updateIncreaseWithLock(lockKey, increase, expiry);
		}
	}
	
	/**
	 * get element from cache. if no element in cache, call ICacheProvider to
	 * get value.
	 * 
	 * @param key
	 * @param cacheProvider
	 * @return
	 */
	public Object getWithProvider(String key, ICacheProvider cacheProvider, String methodName, Class<?>[] parameterTypes, 
			Object[] parameterValues) throws BaseClientException{
		if(cachedClient.get(key) == null){
			try {
				Class<? extends ICacheProvider> cacheProviderClass = cacheProvider.getClass();
				Method cacheProviderMethod = cacheProviderClass.getMethod(methodName, parameterTypes);
				Object value = cacheProviderMethod.invoke(cacheProvider, parameterValues);
				return value;
			} catch (SecurityException e) {
				LOGGER.error(ExceptionUtils.getFullStackTrace(e));
				throw new BaseClientException(e);
			} catch (IllegalArgumentException e) {
				LOGGER.error(ExceptionUtils.getFullStackTrace(e));
				throw new BaseClientException(e);
			} catch (NoSuchMethodException e) {
				LOGGER.error(ExceptionUtils.getFullStackTrace(e));
				throw new BaseClientException(e);
			} catch (IllegalAccessException e) {
				LOGGER.error(ExceptionUtils.getFullStackTrace(e));
				throw new BaseClientException(e);
			} catch (InvocationTargetException e) {
				LOGGER.error(ExceptionUtils.getFullStackTrace(e));
				throw new BaseClientException(e);
			} catch (Exception e) {
				LOGGER.error(ExceptionUtils.getFullStackTrace(e));
				throw new BaseClientException(e);
			}
		}
		return cachedClient.get(key);
	}

	/**
	 * @return the cachedClient
	 */
	public static MemCachedClient getCachedClient() {
		return cachedClient;
	}

	/**
	 * @param cachedClient the cachedClient to set
	 */
	public static void setCachedClient(MemCachedClient cachedClient) {
		MemcacheMultiManagerForGwhalin.cachedClient = cachedClient;
	}

	/**
	 * @return the memMap
	 */
	public static Map<String, MemcacheMultiManagerForGwhalin> getMemMap() {
		return memMap;
	}

	/**
	 * @param memMap the memMap to set
	 */
	public static void setMemMap(Map<String, MemcacheMultiManagerForGwhalin> memMap) {
		MemcacheMultiManagerForGwhalin.memMap = memMap;
	}

	/**
	 * @return the serverIP
	 */
	public static String[] getServerIP() {
		return serverIP;
	}

	/**
	 * @param serverIP the serverIP to set
	 */
	public static void setServerIP(String[] serverIP) {
		MemcacheMultiManagerForGwhalin.serverIP = serverIP;
	}

	/**
	 * @return the weights
	 */
	public static Integer[] getWeights() {
		return weights;
	}

	/**
	 * @param weights the weights to set
	 */
	public static void setWeights(Integer[] weights) {
		MemcacheMultiManagerForGwhalin.weights = weights;
	}

	/**
	 * @return the initConn
	 */
	public static int getInitConn() {
		return initConn;
	}

	/**
	 * @param initConn the initConn to set
	 */
	public static void setInitConn(int initConn) {
		MemcacheMultiManagerForGwhalin.initConn = initConn;
	}

	/**
	 * @return the minConn
	 */
	public static int getMinConn() {
		return minConn;
	}

	/**
	 * @param minConn the minConn to set
	 */
	public static void setMinConn(int minConn) {
		MemcacheMultiManagerForGwhalin.minConn = minConn;
	}

	/**
	 * @return the maxConn
	 */
	public static int getMaxConn() {
		return maxConn;
	}

	/**
	 * @param maxConn the maxConn to set
	 */
	public static void setMaxConn(int maxConn) {
		MemcacheMultiManagerForGwhalin.maxConn = maxConn;
	}

	/**
	 * @return the maxIdle
	 */
	public static int getMaxIdle() {
		return maxIdle;
	}

	/**
	 * @param maxIdle the maxIdle to set
	 */
	public static void setMaxIdle(int maxIdle) {
		MemcacheMultiManagerForGwhalin.maxIdle = maxIdle;
	}

	/**
	 * @return the maintSleep
	 */
	public static int getMaintSleep() {
		return maintSleep;
	}

	/**
	 * @param maintSleep the maintSleep to set
	 */
	public static void setMaintSleep(int maintSleep) {
		MemcacheMultiManagerForGwhalin.maintSleep = maintSleep;
	}

	/**
	 * @return the socketTO
	 */
	public static int getSocketTO() {
		return socketTO;
	}

	/**
	 * @param socketTO the socketTO to set
	 */
	public static void setSocketTO(int socketTO) {
		MemcacheMultiManagerForGwhalin.socketTO = socketTO;
	}

	/**
	 * @return the socketConnectTO
	 */
	public static int getSocketConnectTO() {
		return socketConnectTO;
	}

	/**
	 * @param socketConnectTO the socketConnectTO to set
	 */
	public static void setSocketConnectTO(int socketConnectTO) {
		MemcacheMultiManagerForGwhalin.socketConnectTO = socketConnectTO;
	}

	/**
	 * @return the lOCK_FLAG
	 */
	public static String getLOCK_FLAG() {
		return LOCK_FLAG;
	}

	/**
	 * @param lOCK_FLAG the lOCK_FLAG to set
	 */
	public static void setLOCK_FLAG(String lOCK_FLAG) {
		LOCK_FLAG = lOCK_FLAG;
	}

	/**
	 * @return the memKey
	 */
	public String getMemKey() {
		return memKey;
	}

	/**
	 * @param memKey the memKey to set
	 */
	public void setMemKey(String memKey) {
		this.memKey = memKey;
	}

}
