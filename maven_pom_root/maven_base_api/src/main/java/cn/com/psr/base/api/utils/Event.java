package cn.com.psr.base.api.utils;

import java.lang.reflect.Method;

public class Event {
	
	// 要执行的对象
	private Object object;
	// 要执行的方法名
	private String methodName;
	// 要执行的方法参数
	private Object[] params;
	// 要执行方法的参数类型
	private Class<?>[] paramTypes;
	
	public Event(){}
	
	public Event(Object object, String methodName, Object... args){
		this.object = object;
		this.methodName = methodName;
		this.params = args;
		contractParamTypes(this.params);
	}
	
	/**
	 * 根据参数数组生成参数类型数组
	 * @param params
	 */
	private void contractParamTypes(Object[] params){
		this.paramTypes = new Class[params.length];
		for(int i = 0; i < params.length; i++){
			this.paramTypes[i] = params[i].getClass();
		}
	}
	
	/**
	 * 执行该对象的方法
	 * @throws Exception
	 */
	public void invoke() throws Exception{
		Method method = object.getClass().getMethod(this.getMethodName(), this.getParamTypes());
		if(null == method){
			return;
		}
		method.invoke(this.object, params);
	}

	/**
	 * @return the object
	 */
	public Object getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(Object object) {
		this.object = object;
	}

	/**
	 * @return the methodName
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * @param methodName the methodName to set
	 */
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	/**
	 * @return the params
	 */
	public Object[] getParams() {
		return params;
	}

	/**
	 * @param params the params to set
	 */
	public void setParams(Object[] params) {
		this.params = params;
	}

	/**
	 * @return the paramTypes
	 */
	public Class<?>[] getParamTypes() {
		return paramTypes;
	}

	/**
	 * @param paramTypes the paramTypes to set
	 */
	public void setParamTypes(Class<?>[] paramTypes) {
		this.paramTypes = paramTypes;
	}
	
}
