package cn.com.psr.general.study.design.mode.abstractfactory.demo;

public class DataAccess {

	public static IUser createUser(String db){
		IUser user = null;
		switch (db) {
		case "sqlserver":
			user = new SqlserverUser();
			break;
		case "access":
			user = new AccessUser();
			break;
		}
		return user;
	}
	
	public static IDepartment createDepartment(String db){
		IDepartment department = null;
		switch (db) {
		case "sqlserver":
			department = new SqlServerDepartment();
			break;
		case "access":
			department = new AccessDepartment();
			break;
		}
		return department;
	}
	
}
