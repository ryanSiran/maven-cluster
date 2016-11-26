package cn.com.psr.general.study.design.mode.abstractfactory.demo;

public class AccessFactory implements IFactory{

	@Override
	public IUser createUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new AccessDepartment();
	}

}
