package cn.com.psr.general.study.design.mode.observer.demo;

public interface NewSubject {

	public void toNotify();
	
	public String getSubjectState();
	public void setSubjectState(String say);
	
}
