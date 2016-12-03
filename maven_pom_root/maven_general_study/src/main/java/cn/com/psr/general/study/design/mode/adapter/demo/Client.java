package cn.com.psr.general.study.design.mode.adapter.demo;

public class Client {

	public static void main(String[] args) {
		Player f = new Forwards("詹姆斯");
		f.attack();
		Player g = new Guards("保罗");
		g.attack();
		Player c = new Center("姚明");
		c.attack();
		c.defense();
	}
	
}
