package test.cn.com.psr.general.study.algorithm.sort;

import java.util.Arrays;

import org.junit.Test;

import cn.com.psr.general.study.algorithm.sort.BubbleSort;

public class BubbleSortTest {

	BubbleSort bubbleSort = new BubbleSort();
	
	@Test
	public void testBubbleSortMethod(){
		int[] nums = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		nums = bubbleSort.bubbleSortMethod(nums);
		// 结果测试
		System.out.println("\r\n 最终结果--> \r\n");
		System.out.println(Arrays.toString(nums));
	}
	
	@Test
	public void testBubbleSortDemo1(){
		bubbleSort.bubbleSortDemo1();
	}
	
	@Test
	public void testBubbleSortDemo2(){
		bubbleSort.bubbleSortDemo2();
	}
	
}
