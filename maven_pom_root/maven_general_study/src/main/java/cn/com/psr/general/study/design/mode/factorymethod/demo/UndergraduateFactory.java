package cn.com.psr.general.study.design.mode.factorymethod.demo;

public class UndergraduateFactory implements IFactory{

	@Override
	public LeiFeng createLeiFeng() {
		return new Undergraduate();
	}

}
