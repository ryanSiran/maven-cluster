package cn.com.psr.general.study.design.mode.strategy.demo;

public class Client {

	public static void main(String[] args) {
//		System.out.println("开始购物，花费120元");
//		CashSuper cs = CashFactory.createCashAccept("1");
//		System.out.println("无优惠 --> " + cs.acceptCash(120) + "元");
//		cs = CashFactory.createCashAccept("2");
//		System.out.println("打8折 --> " + cs.acceptCash(120) + "元");
//		cs = CashFactory.createCashAccept("3");
//		System.out.println("满100减10 --> " + cs.acceptCash(120) + "元");
		System.out.println("开始购物，花费120元");
		CashContext cc = new CashContext("1");
		System.out.println("无优惠 --> " + cc.getResult(120) + "元");
		cc = new CashContext("2");
		System.out.println("打8折 --> " + cc.getResult(120) + "元");
		cc = new CashContext("3");
		System.out.println("满100减10 --> " + cc.getResult(120) + "元");
	}
	
}
