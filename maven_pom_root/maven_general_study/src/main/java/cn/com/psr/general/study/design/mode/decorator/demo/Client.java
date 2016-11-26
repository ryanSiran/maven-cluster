package cn.com.psr.general.study.design.mode.decorator.demo;

public class Client {

	public static void main(String[] args) {
		
		Person sr = new Person("司然");
		System.out.println("第一种装扮:");
		
		Sneakers pqx = new Sneakers();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();
		
		pqx.Decorate(sr);
		kk.Decorate(pqx);
		dtx.Decorate(kk);
		dtx.show();
		
		System.out.println("第二种装扮：");
		
		LeatherShoes px = new LeatherShoes();
		Tie ld = new Tie();
		Suit xz = new Suit();
		
		px.Decorate(sr);
		ld.Decorate(px);
		xz.Decorate(ld);
		xz.show();
		
	}
	
}
