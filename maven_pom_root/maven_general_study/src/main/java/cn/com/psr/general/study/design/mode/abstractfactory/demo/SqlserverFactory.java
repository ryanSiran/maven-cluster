package cn.com.psr.general.study.design.mode.abstractfactory.demo;

public class SqlserverFactory implements IFactory{

	@Override
	public IUser createUser() {
		return new SqlserverUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlServerDepartment();
	}

}
