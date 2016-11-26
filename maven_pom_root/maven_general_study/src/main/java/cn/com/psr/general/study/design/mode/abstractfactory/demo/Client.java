package cn.com.psr.general.study.design.mode.abstractfactory.demo;

public class Client {

	public static void main(String[] args) {
		User user = new User();
		
		IFactory factory = new AccessFactory();
		
		IUser iu = factory.createUser();
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = factory.createDepartment();
		id.insert(null);
		id.getDepartment(1);
		
		System.out.println("---------------------------");
		System.out.println(" 运用了简单工厂  ");
		
		User userx = new User();

		IUser iux = DataAccess.createUser("access");
		
		iux.insert(userx);
		iux.getUser(1);
		
	}
	
}
