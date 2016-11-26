package cn.com.psr.general.study.design.mode.builder.demo;

public class Director {

	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
	
}
