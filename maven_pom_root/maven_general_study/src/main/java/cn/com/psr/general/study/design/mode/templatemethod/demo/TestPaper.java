package cn.com.psr.general.study.design.mode.templatemethod.demo;

public abstract class TestPaper {

	public void testQuestion1(){
		System.out.println("这里是第1题");
		System.out.println("答案：" + answer1());
	}
	
	public abstract String answer1();
	
	public void testQuestion2(){
		System.out.println("这里是第2题");
		System.out.println("答案：" + answer2());
	}
	
	public abstract String answer2();
	
	public void testQuestion3(){
		System.out.println("这里是第3题");
		System.out.println("答案：" + answer3());
	}
	
	public abstract String answer3();
}
