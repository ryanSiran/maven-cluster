package cn.com.psr.general.study.design.mode.builder.demo;

public class PersonDirector {

	private PersonBuilder pb;
	
	public PersonDirector(PersonBuilder pb) {
		this.pb = pb;
	}
	
	public void createPerson(){
		pb.BuildHead();
		pb.BuildBody();
		pb.BuildArmLeft();
		pb.BuildArmRight();
		pb.BuildLegLeft();
		pb.BuildLegRight();
	}
	
}
