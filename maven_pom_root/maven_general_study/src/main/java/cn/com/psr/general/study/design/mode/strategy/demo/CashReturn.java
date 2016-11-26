package cn.com.psr.general.study.design.mode.strategy.demo;

public class CashReturn extends CashSuper{

	private double moneyCondition = 0.0;
	private double moneyReturn = 0.0;
	
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	
	@Override
	public double acceptCash(double money) {
		if(money >= moneyCondition){
			return (money - Math.floor(money / moneyCondition) * moneyReturn);
		}
		return money;
	}

}
