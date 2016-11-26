package cn.com.psr.general.study.design.mode.builder.demo;

import java.util.ArrayList;
import java.util.List;

public class Product {

	List<String> parts = new ArrayList<>();
	
	public void Add(String parts){
		this.parts.add(parts);
	}
	
	public void show(){
		System.out.println("产品  创建 -------- ");
		for(String part : parts){
			System.out.println(part);
		}
	}
	
}
