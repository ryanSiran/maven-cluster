package cn.com.psr.general.study.design.mode.observer.demo;

public class MusicObserver {

	protected String name;
	
	public MusicObserver(String name) {
		this.name = name;
	}
	
	public void closeMusicMarket(){
		System.out.println(name + " 关闭音乐，继续工作！");
	}
	
}
