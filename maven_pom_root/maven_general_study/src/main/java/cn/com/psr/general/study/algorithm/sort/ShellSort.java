package cn.com.psr.general.study.algorithm.sort;

/**
 * 
 * <B> Function : </B> ShellSort <br>
 * <B> Description : </B> 希尔排序 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月20日 下午9:29:19<br>
 * @version v1.0
 *
 */
public class ShellSort {

	/*
	 * 基本思想：算法先将要排序的一组数按某个增量 d（n/2,n为要排序数的个数）分成若

		干组，每组中记录的下标相差 d.对每组中全部元素进行直接插入排序，然后再用一个较小
		
		的增量（d/2）对它进行分组，在每组中再进行直接插入排序。当增量减到 1 时，进行直接
		
		插入排序后，排序完成。
	 */
	
	public void shellSortDemo1(){
		int[] a = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		double d1 = a.length;
		int temp = 0;
		
		while(true){
			d1 = Math.ceil(d1/2); // 浮点向上取整
			int d = (int)d1;
			for(int x = 0; x < d; x++){
				
				for(int i = x + d; i < a.length; i += d){
					int j = i - d;
					temp = a[i];
					for(; j >= 0 && temp < a[j]; j -= d){
						a[j+d] = a[j];
					}
					a[j+d] = temp;
				}
				
			}
			
			if(d == 1){
				break;
			}
			
		}
		
		// 结果测试
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
}





















