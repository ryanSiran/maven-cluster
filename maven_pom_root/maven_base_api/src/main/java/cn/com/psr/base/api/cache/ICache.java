package cn.com.psr.base.api.cache;

/**
 * 
 * <B> Function : </B> ICache <br>
 * <B> Description : </B> 缓存接口 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月18日 下午6:38:39 <br>
 * @version v1.0
 *
 */
public interface ICache {

	void addCache(String key, Object obj);
	
	void delCache(String key);
	
	void flushCache();
	
	Object getCache(String key);
	
	void refreshCache(String key, Object obj);
	
}
