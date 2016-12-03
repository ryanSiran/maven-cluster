package cn.com.psr.general.study.design.mode.adapter.demo;

public class ForeignCenter{

	private String name;
	
	public ForeignCenter(String name) {
		this.name = name;
	}
	
	public void jingong(){
		System.out.println("外籍中锋 " + name + " 进攻");
	}
	
	public void fangshou(){
		System.out.println("外籍中锋 " + name + " 防守");
	}
	
}
