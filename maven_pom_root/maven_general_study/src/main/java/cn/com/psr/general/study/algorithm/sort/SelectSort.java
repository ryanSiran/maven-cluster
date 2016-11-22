package cn.com.psr.general.study.algorithm.sort;

/**
 * 
 * <B> Function : </B> SelectSort <br>
 * <B> Description : </B> 简单排序 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月21日 下午4:25:46 <br>
 * @version v1.0
 *
 */
public class SelectSort {

	/*
	 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换； 
 
		然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一
		 
		个数比较为止。 

	 * */
	public int[] selectSortMethod(int[] nums){
		int position = 0;
		int temp = 0;
		for(int i = 0; i < nums.length; i++){
			position = i;
			temp = nums[i];
			for(int j = i+1; j < nums.length; j++){
				if(nums[j] < temp){
					temp = nums[j];
					position = j;
				}
			}
			nums[position] = nums[i];
			nums[i] = temp;
		}
		return nums;
	}
	
	public void selectSortDemo1(){
		int[] a = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int position = 0;
		int temp = 0;
		for(int i = 0; i < a.length; i++){
			position = i;
			temp = a[i];
			for(int j = i+1; j < a.length; j++){
				if(a[j] < temp){
					temp = a[j];
					position = j;
				}
			}
			a[position] = a[i];
			a[i] = temp;
		}
		// 结果测试
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}		
	}
	
}















