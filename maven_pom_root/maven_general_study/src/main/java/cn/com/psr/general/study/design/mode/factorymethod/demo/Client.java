package cn.com.psr.general.study.design.mode.factorymethod.demo;

public class Client {

	public static void main(String[] args) {
		IFactory factory = new UndergraduateFactory();
		LeiFeng leifeng = factory.createLeiFeng();
		leifeng.BuyRice();
		leifeng.Sweep();
		leifeng.Wash();
	}
	
}
