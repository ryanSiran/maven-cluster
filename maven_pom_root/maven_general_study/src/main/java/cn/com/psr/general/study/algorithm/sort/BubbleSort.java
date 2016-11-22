package cn.com.psr.general.study.algorithm.sort;

import java.util.Arrays;

/**
 * 
 * <B> Function : </B> BubbleSort <br>
 * <B> Description : </B> 冒泡排序 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月22日 上午10:19:07 <br>
 * @version v1.0
 *
 */
public class BubbleSort {
	/**  
	 * 冒泡法排序<br/>  

	 * <li>比较相邻的元素。如果第一个比第二个大，就交换他们两个。</li>  
	 * <li>对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。</li>  
	 * <li>针对所有的元素重复以上的步骤，除了最后一个。</li>  
	 * <li>持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。</li>  

	 *   
	 * @param numbers  
	 *            需要排序的整型数组  
	 */  
	public int[] bubbleSortMethod(int[] nums){
		int temp = 0;
		int size = nums.length;
		for(int i = 0; i < size - 1; i++){
			for(int j = i+1; j < size; j++){
				if(nums[i] > nums[j]){
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

	public void bubbleSortDemo1(){
		int[] a = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int temp = 0;
		for(int i = 0; i < a.length-1; i++){
			for(int j = 0; j < a.length-1-i; j++){
				if(a[j] > a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		// 结果测试
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}	
	}
	
	public void bubbleSortDemo2(){
		int[] a = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int temp = 0;
		int size = a.length;
		for(int i = 0; i < size - 1; i++){
			for(int j = i + 1; j < size; j++){
				if(a[i] > a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
		
		// 结果测试
		System.out.println("\r\n 最终结果--> \r\n");
		System.out.println(Arrays.toString(a));
	}
	
}



















