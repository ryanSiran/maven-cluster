package cn.com.psr.general.study.design.mode.builder.demo;

public class Client {

	public static void main(String[] args) {
		PersonThinBuilder ptb = new PersonThinBuilder();
		PersonDirector pdt = new PersonDirector(ptb);
		pdt.createPerson();
		
		PersonFatBuilder pfb = new PersonFatBuilder();
		PersonDirector pdf = new PersonDirector(pfb);
		pdf.createPerson();
		
		System.out.println("----------------------");
		System.out.println(" demo 2 ");
		
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		
		director.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
		
	}
	
}
