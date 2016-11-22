package test.cn.com.psr.general.study.algorithm.sort;

import org.junit.Test;

import cn.com.psr.general.study.algorithm.sort.SelectSort;

public class SelectSortTest {

	SelectSort selectSort = new SelectSort();
	
	@Test
	public void testSelectSortMethod(){
		int[] nums = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		nums = selectSort.selectSortMethod(nums);
		for(int num : nums){
			System.out.println(num);
		}
	}
	
	@Test
	public void testSelectSortDemo1(){
		selectSort.selectSortDemo1();
	}
}
