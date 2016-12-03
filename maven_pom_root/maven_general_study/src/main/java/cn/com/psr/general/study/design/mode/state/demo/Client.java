package cn.com.psr.general.study.design.mode.state.demo;

public class Client {

	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		
		c.request();
		c.request();
		c.request();
		c.request();
		
		System.out.println("-----------------------------");
		System.out.println("工作状态");
		System.out.println("-----------------------------");
		
		Work work = new Work();
		work.setHour(9);
		work.writeProgram();
		work.setHour(10);
		work.writeProgram();
		work.setHour(11);
		work.writeProgram();
		work.setHour(12);
		work.writeProgram();
		work.setHour(13);
		work.writeProgram();
		work.setHour(14);
		work.writeProgram();
		work.setHour(15);
		work.writeProgram();
		work.setHour(16);
		work.writeProgram();
		
		work.setFinish(true);
		
		work.setHour(17);
		work.writeProgram();
		work.setHour(18);
		work.writeProgram();
		work.setHour(19);
		work.writeProgram();
		work.setHour(20);
		work.writeProgram();
		work.setHour(21);
		work.writeProgram();
		work.setHour(22);
		work.writeProgram();
		work.setHour(23);
		work.writeProgram();
	}
	
}
