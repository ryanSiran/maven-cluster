package cn.com.psr.general.study.design.mode.observer.demo;

public class LOLObserver {

	protected String name;
	
	public LOLObserver(String name) {
		this.name = name;
	}
	
	public void closeLOLMarket(){
//		System.out.println(sub.getSubjectState() + " , " + name + " 关闭LOL游戏，继续工作！");
		System.out.println(name + " 关闭LOL游戏，继续工作！");
	}
	
}
