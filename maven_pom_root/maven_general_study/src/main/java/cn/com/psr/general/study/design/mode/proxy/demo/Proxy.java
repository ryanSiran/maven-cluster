package cn.com.psr.general.study.design.mode.proxy.demo;

public class Proxy implements GiveGift{

	private Pursuit gg;
	
	public Proxy(SchoollGirl mm) {
		gg = new Pursuit(mm);
	}
	
	@Override
	public void GiveDolls() {
		gg.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		gg.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		gg.GiveChocolate();
	}

}
