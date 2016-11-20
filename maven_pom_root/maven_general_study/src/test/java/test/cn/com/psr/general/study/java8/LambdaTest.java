package test.cn.com.psr.general.study.java8;

import org.junit.Test;

import cn.com.psr.general.study.java8.Lambda;

public class LambdaTest {

	Lambda lambda = new Lambda();
	
	@Test
	public void java7Thread() {
		lambda.java7Thread();
	}
	
	@Test
	public void java8Thread() {
		lambda.java8Thread();
	}
	
	@Test
	public void lambdaPrinciple() {
		lambda.lambdaPrinciple();
	}
	
	@Test
	public void testJava7List() {
		lambda.java7List();
	}
	
	@Test
	public void testJava8List() {
		lambda.java8List();
	}

}
