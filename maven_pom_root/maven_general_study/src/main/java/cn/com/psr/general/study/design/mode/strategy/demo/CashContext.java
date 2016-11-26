package cn.com.psr.general.study.design.mode.strategy.demo;

public class CashContext {

	CashSuper cs = null;
	
	public CashContext(String type){
		switch (type) {
		case "1":
			cs = new CashNormal();
			break;
		case "2":
			cs = new CashRebate(0.8);
			break;
		case "3":
			cs = new CashReturn(100, 10);
			break;
		default:
			cs = new CashNormal();
			break;
		}
	}
	
	public double getResult(double money){
		return cs.acceptCash(money);
	}
	
}
