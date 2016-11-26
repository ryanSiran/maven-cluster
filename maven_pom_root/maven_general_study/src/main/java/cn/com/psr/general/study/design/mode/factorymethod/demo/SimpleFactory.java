package cn.com.psr.general.study.design.mode.factorymethod.demo;

public class SimpleFactory {

	public static LeiFeng createLeiFeng(String type){
		LeiFeng result = null;
		switch (type) {
		case "1":
			result = new Undergraduate();
			break;
		case "2":
			result = new Volunteer();
			break;
		}
		return result;
	}
	
}
