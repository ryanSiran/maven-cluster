package cn.com.psr.general.study.design.mode.proxy.demo;

public class Client {

	public static void main(String[] args) {
		SchoollGirl mm = new SchoollGirl();
		mm.setName("美美");
		
		Proxy daili = new Proxy(mm);
		
		daili.GiveDolls();
		daili.GiveFlowers();
		daili.GiveChocolate();
		
	}
	
}
