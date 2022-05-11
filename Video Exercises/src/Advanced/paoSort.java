/**
 * 
 */
package Advanced;

import java.util.Scanner;

/**
 *冒泡排序\选择排序\二分查找
 * @author Tony
 * @version 1.0
 * @data 2022年5月4日下午10:36:26
 * @conpyright The GeekTeam
 * @description 
 * 1.一共会比较数组元素个数-1轮
 * 2.每一轮，比较的次数比上一轮少一
 * 3.如果前面一个数组大于/小于后面的一个数字，那么交换	
 */
public class paoSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sort[] = new int[10];
		paoSort method  =new paoSort();    //定义一个paoSort的对象，并调用里面的方法
		for (int i = 0; i < sort.length; i++) {    //随机生成一个数列
			 sort[i] = (int)(Math.random() * 100);
		}
		System.out.println("排序前");	    
		method.Print(sort);
	   
	    for (int i = 0; i < sort.length - 1; i++) {
			for (int j = 0; j < sort.length - 1 - i; j++) {
				if (sort[j + 1] < sort[j]) {
					int temp = sort[j];
					sort[j ] = sort[j + 1];
					sort[j + 1] = temp;	}	
			     }
			}
			 System.out.println(" ");
			 System.out.println("冒泡排序后");
			  method.Print(sort);
			System.out.println(" ");
		  System.out.println("选择排序后");
		  choiceSort choicesort = new choiceSort();
		  choicesort.sort(sort);
		  method.Print(sort);
//		  System.out.println("请选择要查找的数字");
		   Scanner input = new Scanner(System.in);
//		   int seachNum = input.nextInt();
//		   choicesort.BinarySearch(sort, seachNum);
		   System.out.println("\n请输入要删除的数字");
		   int delNum = input.nextInt();
		   choicesort.DeleteNum(delNum, sort);
		   input.close();
	    }
	
	//打印方法
	void Print(int sort[]) {
		for (int i = 0; i < sort.length; i++) {
			System.out.print(" " + sort[i]);}
	     }
     }
	   

