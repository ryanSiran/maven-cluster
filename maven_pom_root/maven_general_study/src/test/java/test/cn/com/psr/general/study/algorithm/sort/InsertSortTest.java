package test.cn.com.psr.general.study.algorithm.sort;

import org.junit.Test;

import cn.com.psr.general.study.algorithm.sort.InsertSort;

public class InsertSortTest {

	InsertSort insertSort = new InsertSort();
	
	@Test
	public void testInsertSortMothed(){
		int[] nums = {49,38,65,97,76,13,27,49,78,34,12,12,5,4,62,99,98,54,56,17,18,23,34,15,5,25,53,51};
		nums = insertSort.insertSortMethod(nums);
		for(int n : nums){
			System.out.println(n);
		}
	}
	
	@Test
	public void testInsertSortDemo1(){
		insertSort.insertSortDemo1();
	}
	
	@Test
	public void testInsertSortDemo2(){
		insertSort.insertSortDemo2();
	}
	
	@Test
	public void testInsertSortDemo(){
		insertSort.insertSortDemo();
	}
	
}
