package cn.com.psr.general.study.design.mode.factorymethod.demo;

public class VolunteerFactory implements IFactory{

	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
