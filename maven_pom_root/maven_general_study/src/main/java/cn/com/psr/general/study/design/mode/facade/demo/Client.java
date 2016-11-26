package cn.com.psr.general.study.design.mode.facade.demo;

public class Client {

	public static void main(String[] args) {
		
		Fund fund = new Fund();
		fund.buyFund();
		fund.shellFund();
		
	}
	
}
