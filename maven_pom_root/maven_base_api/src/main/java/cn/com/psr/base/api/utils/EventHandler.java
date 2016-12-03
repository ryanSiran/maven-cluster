package cn.com.psr.base.api.utils;

import java.util.ArrayList;
import java.util.List;

public class EventHandler {

	private List<Event> objects;
	
	public EventHandler(){
		objects = new ArrayList<Event>();
	}
	
	/**
	 * 添加某个对象要执行的事件，及需要的参数
	 * @param object
	 * @param methodName
	 * @param args
	 */
	public void addEvent(Object object, String methodName, Object... args){
		objects.add(new Event(object, methodName, args));
	}
	
	public void notifys() throws Exception {
		for(Event e : objects){
			e.invoke();
		}
	}
	
}
