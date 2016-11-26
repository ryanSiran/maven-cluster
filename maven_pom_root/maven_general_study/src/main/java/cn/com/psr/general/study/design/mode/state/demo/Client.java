package cn.com.psr.general.study.design.mode.state.demo;

public class Client {

	public static void main(String[] args) {
		Context c = new Context(new ConcreteStateA());
		
		c.request();
		c.request();
		c.request();
		c.request();
		
	}
	
}
