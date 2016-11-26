package cn.com.psr.general.study.design.mode.abstractfactory.demo;

public class AccessDepartment implements IDepartment{

	@Override
	public void insert(Object obj) {
		System.out.println("access 插入一条数据");
	}

	@Override
	public Object getDepartment(int id) {
		System.out.println("access 查询一条数据");
		return null;
	}
	
}
