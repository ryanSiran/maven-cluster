package cn.com.psr.general.study.algorithm.sort;

/**
 * 
 * <B> Function : </B> InsertSort <br>
 * <B> Description : </B> 插入排序算法（直接插入排序算法） <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月20日 下午5:10:17<br>
 * @version v1.0
 *
 */
public class InsertSort {

	/*
	 * 基本思想：在要排序的一组数中，假设前面(n-1)[n>=2] 个数已经是排 
	 * 好顺序的，现在要把第n 个数插到前面的有序数中，使得这 n个数 
	 * 也是排好顺序的。如此反复循环，直到全部排好顺序。
	 * */
	public int[] insertSortMethod(int[] nums){
		int temp = 0;
		int j = 0;
		for(int i = 1; i < nums.length; i++){
			temp = nums[i];
			for(j = i; j > 0 && temp < nums[j-1]; j--){
				nums[j] = nums[j-1];
			}
			nums[j] = temp;
		}
		return nums;
	}

	public void insertSortDemo1(){
		int[] a = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int temp = 0;
		for(int i = 1; i < a.length; i++){
			int j = i - 1;
			temp = a[i];
			for(; j >= 0 && temp <= a[j]; j--){
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
		/* 47,43,32,78,12
		 * i = 1, j = 0, temp = a[1] = 43, a[0] = 47
		 * --> a[1] = a[0] = 47, j = -1, a[-1] = /
		 * --> a[0] = temp = 43
		 * 43,47,32,78,12
		 * i = 2, j = 1, temp = a[2] = 32, a[1] = 47
		 * --> a[2] = a[1] = 47, j = 0; a[0] = 43
		 * --> a[1] = a[0] = 43, j = -1, / 
		 * --> a[0] = temp = 32
		 * 
		 * */
		// 结果测试
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public void insertSortDemo2(){
		int[] a = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int temp = 0;
		int j = 0;
		for(int i = 1; i < a.length; i++){
			temp = a[i];
			for(j = i; j > 0 && temp < a[j-1]; j--){
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
		// 结果测试
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public void insertSortDemo(){
		int[] a = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int temp = 0;
		int j = 0;
		for(int i = 1; i < a.length; i++){
			temp = a[i];
			for(j = i; j > 0 && temp < a[j-1]; j--){
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
		// 结果测试
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
}











