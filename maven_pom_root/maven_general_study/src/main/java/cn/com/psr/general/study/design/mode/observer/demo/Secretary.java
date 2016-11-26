package cn.com.psr.general.study.design.mode.observer.demo;

import cn.com.psr.general.study.utils.delegation.EventHandler;

public class Secretary implements NewSubject{

	public EventHandler update = new EventHandler();
	
	private String action;
	
	@Override
	public String getSubjectState() {
		return action;
	}
	@Override
	public void setSubjectState(String say) {
		this.action = say;
	}
	
	@Override
	public void toNotify() {
		try {
			update.notifys();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setUpdate(Object object, String methodName, Object... args){
		update.addEvent(object, methodName, args);
	}
}
