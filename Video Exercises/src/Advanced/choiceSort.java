/**
 * 
 */
package Advanced;

/**
 * @author Tony
 * @version 1.0
 * @data 2022年5月5日下午3:25:46
 * @conpyright The GeekTeam
 * @description
 * 前提要求：给出的数组必须为从小到大的有序数组
 * 首先将要查找的元素跟数组的中间元素比较
 * 1.如果seachNum小于中间元素，只需要在数组的前半段的元素中继续查找
 * 2.如果seachNum和中间元素相等，则匹配成功，查找成功
 * 3.如果seachNum大于中间元素，只需要在后半段元素中继续查找
 */
public class choiceSort {
           void sort(int array[]){
        	  //选择排序，每次循环，交换i的值和minIndex的值
            for (int i = 0; i < array.length; i++) {
            	int min = array[i];   //假设最小值为i
                int minIndex = i;     //最小值的下标
                for (int j = 1 + i; j < array.length; j++) {
					if (min > array[j]) {
						min = array[j];
						minIndex = j;
					}
					int temp = array[i];
					array[i] = array[minIndex];
					array[minIndex] = temp;
				  }
               } 
            }
           void BinarySearch(int array[],int seachNum) { 
        	   int hight = array.length - 1;    //上界下标
        	   int low = 0;                     //下界下标
        	   while (hight >= low) {
				int mid = (hight  + low) / 2;   //计算中点下标
				if(seachNum > array[mid]) {
					low = mid + 1;
				}
				else if (seachNum < array[mid]) {
					hight = mid - 1;
				}else {
					System.out.println("找到了，下标为" +mid);
					break;	
				   }
			 }      	  
           }
           /**  删除元素操作
            * 1.找到要删除的元素的下标delIndex = 3
            * 2.从要删除下标开始，后面一个元素赋值给前面的元素-覆盖
            * 3.数组总长度减一
            * @param delNum 要删除的元素
            * @param array  要操作的数组
            */
           void DeleteNum(int delNum, int array[]) {
        	   int delNumIndex = -1;
        	   int count = array.length;
        	for (int i = 0; i < count; i++) {
				if (delNum == array[i]) {
					delNumIndex = i;
				}
			}
        	for(int i = delNumIndex; i < count - 1; i++) {
        		array[i] = array[i + 1];
        	}
        	for (int i = 0; i < count; i++) {
				System.out.print(array[i] +" ");
			}
        	   
           }
}
