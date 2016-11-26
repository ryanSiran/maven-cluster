package cn.com.psr.general.study.design.mode.proxy.demo;

public class Pursuit implements GiveGift{

	private SchoollGirl mm;
	
	public Pursuit(SchoollGirl mm) {
		this.mm = mm;
	}
	
	@Override
	public void GiveDolls() {
		System.out.println(mm.getName() + " 送你洋娃娃");
	}

	@Override
	public void GiveFlowers() {
		System.out.println(mm.getName() + " 送你鲜花");
	}

	@Override
	public void GiveChocolate() {
		System.out.println(mm.getName() + " 送你巧克力");
	}

}
