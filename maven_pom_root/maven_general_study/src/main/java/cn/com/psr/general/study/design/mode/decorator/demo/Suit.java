package cn.com.psr.general.study.design.mode.decorator.demo;

public class Suit extends Finery{

	@Override
	public void show() {
		System.out.print("西装 ");
		super.show();
	}
	
}
