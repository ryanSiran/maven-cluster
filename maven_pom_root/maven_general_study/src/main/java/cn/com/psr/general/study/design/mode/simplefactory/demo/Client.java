package cn.com.psr.general.study.design.mode.simplefactory.demo;

public class Client {

	public static void main(String[] args) {
		Operation oper;
		oper = OperationFactory.createOperate("+");
		oper.setNumberA(4);
		oper.setNumberB(73);
		double result = oper.getResult();
		System.out.println(result);
	}
	
}
