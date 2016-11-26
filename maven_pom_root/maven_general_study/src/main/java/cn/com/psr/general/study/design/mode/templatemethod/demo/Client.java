package cn.com.psr.general.study.design.mode.templatemethod.demo;

public class Client {

	public static void main(String[] args) {
		System.out.println("A同学抄的试卷：");
		TestPaperA sA = new TestPaperA();
		sA.testQuestion1();
		sA.testQuestion2();
		sA.testQuestion3();
		
		System.out.println();
		
		System.out.println("B同学抄的试卷：");
		TestPaperB sB = new TestPaperB();
		sB.testQuestion1();
		sB.testQuestion2();
		sB.testQuestion3();
	}
	
}
