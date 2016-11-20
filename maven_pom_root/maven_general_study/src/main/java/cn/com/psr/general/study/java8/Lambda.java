package cn.com.psr.general.study.java8;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Lambda {

	/**
	 * java7新建线程
	 */
	public void java7Thread(){
		new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Thread run()");
			}
			
		}).start();
	}
	
	/**
	 * java8新建线程
	 */
	public void java8Thread(){
		new Thread(
			() -> System.out.println("Thread run()")	
		).start();
	}
	
	/**
	 * lambda表达式原理
	 */
	public void lambdaPrinciple(){
		// Lambda表达式是有类型的，赋值操作的左边就是类型。Lambda表达式的类型实际上是对应接口的类型。
		// Lambda表达式可以包含多行代码，需要用大括号把代码块括起来，就像写函数体那样。
		// 大多数时候，Lambda表达式的参数表可以省略类型，就像代码2和5那样。这得益于javac的类型推导机制，编译器可以根据上下文推导出类型信息。
		Runnable run = () -> System.out.println("Hello World"); // 1
		ActionListener listener = event -> System.out.println("button clicked"); // 2
		Runnable multiLine = () -> { // 3
			System.out.println("Hello");
			System.out.println("World");
		};
		BinaryOperator<Long> add = (Long x, Long y) -> x + y; // 4
		BinaryOperator<Long> addImplicit = (x, y) -> x + y; // 5
	}
	
	/**
	 * java7中List
	 */
	public void java7List(){
		List<String> list = Arrays.asList("1one", "two", "three", "4four");
		for(String str : list){
			if(Character.isDigit(str.charAt(0))){
				System.out.println(str);
			}
		}
	}
	
	/**
	 * java8中List
	 */
	public void java8List(){
		/*
		 * 1. 调用List.stream()方法得到容器的Stream，2. 然后调用filter()方法过滤出以数字开头的字符串，3. 最后调用forEach()方法输出结果。
		 * */
		/*
		 *  使用Stream有两个明显的好处：

			减少了模板代码，只用Lambda表达式指明所需操作，代码语义更加明确、便于阅读。
			
			将外部迭代改成了Stream的内部迭代，方便了JVM本身对迭代过程做优化（比如可以并行迭代）。
		 * */ 
		List<String> list = Arrays.asList("1one", "two", "3three", "4four");
		list.stream() // 1.得到容器的stream
			.filter(str -> Character.isDigit(str.charAt(0))) // 2.选出以数字开头的字符串
			.forEach(str -> System.out.println(str)); // 3.输出字符串
	}
	
	/**
	 * java8中List
	 */
	public void java8ListUpgrade(){
		/*
		 * 1. 调用List.stream()方法得到容器的Stream，2. 然后调用filter()方法选出不以数字开头的字符串，
		 * 3. 之后调用map()方法将字符串转换成大写形式，4. 最后调用collect()方法将结果转换成Set。
		 * 这个例子还向我们展示了方法引用（method references，代码中标号3处）以及收集器（Collector，代码中标号4处）的用法
		 * */
		List<String> list = Arrays.asList("1one", "two", "3three", "4four");
		Set<String> newList = 
			list.stream() // 1.得到容器stream
				.filter(str -> !Character.isDigit(str.charAt(0))) // 2.选出不以数字开头的字符
				.map(String::toUpperCase) // 3.转换成大写形式
				.collect(Collectors.toSet()); // 4.生产结果集
	}
	
	
}
