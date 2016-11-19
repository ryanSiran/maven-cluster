package cn.com.psr.base.api.cache;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * 
 * <B> Function : </B> SimpleMapcacheImpl <br>
 * <B> Description : </B> 简单内存缓存类 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月18日 下午6:47:49 <br>
 * @version v1.0
 *
 */
public class SimpleMapcacheImpl implements ICache{
	private static Map<String, Object> cacheMap = new LinkedHashMap<String, Object>();
	private int maxCacheSize = 250;
	private static Logger LOGGER = Logger.getLogger(SimpleMapcacheImpl.class);
	
	@SuppressWarnings("unused")
	public synchronized void addCache(String key, Object obj) {
		LOGGER.debug("################cache size" + cacheMap.size() + "######################");
		if(cacheMap.size() >= maxCacheSize){
			Set<String> keySet = cacheMap.keySet();
			Iterator<String> iterator = keySet.iterator();
			
			if(iterator.hasNext()){
				String oldkey = iterator.next();
				iterator.remove();
			}
		}
		cacheMap.put(key, obj);
	}

	public void delCache(String key) {
		cacheMap.remove(key);
	}

	public void flushCache() {
		cacheMap.clear();
	}

	public Object getCache(String key) {
		return cacheMap.get(key);
	}

	@SuppressWarnings("unused")
	public synchronized void refreshCache(String key, Object obj) {
		Object oldObj = cacheMap.get(key);
		cacheMap.put(key, obj);
	}

	/**
	 * @return the maxCacheSize
	 */
	public int getMaxCacheSize() {
		return maxCacheSize;
	}

	/**
	 * @param maxCacheSize the maxCacheSize to set
	 */
	public void setMaxCacheSize(int maxCacheSize) {
		this.maxCacheSize = maxCacheSize;
	}
	
}
