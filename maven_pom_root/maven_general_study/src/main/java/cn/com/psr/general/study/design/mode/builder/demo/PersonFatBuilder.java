package cn.com.psr.general.study.design.mode.builder.demo;

public class PersonFatBuilder extends PersonBuilder{

	private String person = "胖子";
	
	@Override
	public void BuildHead() {
		System.out.println(person + "-头");
	}

	@Override
	public void BuildBody() {
		System.out.println(person + "-身体");
	}

	@Override
	public void BuildArmLeft() {
		System.out.println(person + "-左手");
	}

	@Override
	public void BuildArmRight() {
		System.out.println(person + "-右手");
	}

	@Override
	public void BuildLegLeft() {
		System.out.println(person + "-左腿");
	}

	@Override
	public void BuildLegRight() {
		System.out.println(person + "-右腿");
	}

}
