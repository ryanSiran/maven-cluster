package cn.com.psr.general.study.design.mode.abstractfactory.demo;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("在 access 中给 User 添加一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在 access 中给 User 获取一条记录");
		return null;
	}

}
