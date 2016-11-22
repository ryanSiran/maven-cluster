package cn.com.psr.general.study.algorithm.sort;

/**
 * 
 * <B> Function : </B> QuickSort <br>
 * <B> Description : </B> 快速排序 <br>
 * <B> Company : </B> <br>
 *
 * @author Pan_Siran <br>
 * @data 2016年11月22日 上午11:29:52 <br>
 * @version v1.0
 *
 */
public class QuickSort {

	/**  
	 * 快速排序<br/>  
	 * <ul>  
	 * <li>从数列中挑出一个元素，称为“基准”</li>  
	 * <li>重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，  
	 * 该基准是它的最后位置。这个称为分割（partition）操作。</li>  
	 * <li>递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。</li>  
	 * </ul>  
	 *   
	 * @param numbers  
	 * @param start  
	 * @param end  
	 */
	public int[] quickSortMethod(int[] nums, int start, int end){
		if(start < end){
			int base = nums[start];
			int temp;
			int i = start, j = end;
			do{
				while((nums[i] < base) && (i < end)){
					i++;
				}
				while((nums[j] > base) && (j > start)){
					j--;
				}
				if(i <= j){
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					i++;
					j--;
				}
			}while(i < j);
			if(start < j){
				quickSortMethod(nums, start, j);
			}else if(end > i){
				quickSortMethod(nums, i, end);
			}
		}
		return nums;
	}
	
}
























