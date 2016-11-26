package cn.com.psr.general.study.design.mode.abstractfactory.demo;

public interface IFactory {

	IUser createUser();
	
	IDepartment createDepartment();
	
}
