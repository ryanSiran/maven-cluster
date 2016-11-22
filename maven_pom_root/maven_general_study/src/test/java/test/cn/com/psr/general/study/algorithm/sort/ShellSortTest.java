package test.cn.com.psr.general.study.algorithm.sort;

import org.junit.Test;

import cn.com.psr.general.study.algorithm.sort.ShellSort;

public class ShellSortTest {

	ShellSort shellSort = new ShellSort();
	
	@Test
	public void testShellSortMethod() {
		int[] nums = {49,38,65,97,76,13,27,49,78,34,12,12,5,4,62,99,98,54,56,17,18,23,34,15,5,25,53,51};
		nums = shellSort.shellSortMethod(nums);
		for(int n : nums){
			System.out.println(n);
		}
	}
	
	@Test
	public void testShellSortDemo1() {
		shellSort.shellSortDemo1();
	}

}
