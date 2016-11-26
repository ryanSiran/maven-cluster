package cn.com.psr.general.study.design.mode.abstractfactory.demo;

public class SqlServerDepartment implements IDepartment{

	@Override
	public void insert(Object obj) {
		System.out.println("sqlserver 插入一条数据");
	}

	@Override
	public Object getDepartment(int id) {
		System.out.println("sqlserver 查询一条数据");
		return null;
	}

}
