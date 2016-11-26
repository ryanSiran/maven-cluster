package cn.com.psr.general.study.design.mode.strategy.demo;

public class CashRebate extends CashSuper{

	private double moneyRebate = 1.0;
	
	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}
	
	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
