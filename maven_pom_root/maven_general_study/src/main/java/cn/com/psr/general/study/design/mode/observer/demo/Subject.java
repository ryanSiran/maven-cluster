package cn.com.psr.general.study.design.mode.observer.demo;

public interface Subject {

	public void attach(Observer observer);
	
	public void detach(Observer observer);
	
	public void toNotify();
	
	public String getSubjectState();
	public void setSubjectState(String say);
	
	
}
