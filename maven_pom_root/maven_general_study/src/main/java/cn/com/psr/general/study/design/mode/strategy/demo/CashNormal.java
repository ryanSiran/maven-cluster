package cn.com.psr.general.study.design.mode.strategy.demo;

public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
