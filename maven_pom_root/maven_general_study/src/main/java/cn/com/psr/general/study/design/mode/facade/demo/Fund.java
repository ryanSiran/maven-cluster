package cn.com.psr.general.study.design.mode.facade.demo;

public class Fund {

	Stock1 stock1;
	Stock2 stock2;
	Stock3 stock3;
	Stock4 stock4;
	Stock5 stock5;
	
	public Fund() {
		stock1 = new Stock1();
		stock2 = new Stock2();
		stock3 = new Stock3();
		stock4 = new Stock4();
		stock5 = new Stock5();
	}
	
	public void buyFund(){
		stock1.buy();
		stock2.buy();
		stock3.buy();
		stock4.buy();
		stock5.buy();
	}
	
	public void shellFund(){
		stock1.shell();
		stock2.shell();
		stock3.shell();
		stock4.shell();
		stock5.shell();
	}
	
}
