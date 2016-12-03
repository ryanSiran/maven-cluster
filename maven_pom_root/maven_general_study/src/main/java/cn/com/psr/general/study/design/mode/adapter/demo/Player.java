package cn.com.psr.general.study.design.mode.adapter.demo;

public abstract class Player {

	protected String name;
	public Player(String name){
		this.name = name;
	}
	
	public abstract void attack();
	
	public abstract void defense();
	
}
