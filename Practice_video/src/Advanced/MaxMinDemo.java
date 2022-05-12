/**
 * 
 */
package Advanced;


import java.util.Scanner;

/**
 * 数组练习
 * @author Tony
 * @version 1.0
 * @data 2022年5月4日下午1:26:35
 * @conpyright The GeekTeam
 * @description 随机产生一组数组，求里面的最大值和最小值
 */
public class MaxMinDemo {

	public static void main(String[] args) {
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int)(Math.random() * 10000)) % 1001;   //0 - 1000的随机数
		}
       for (int j = 0; j < array.length; j++) {
		System.out.printf("%d\t",array[j]);
	 }
       // 1.假设第一个元素为最大值/最小值
       // 2.拿最大值/和最小值再数组中进行比较，如果某个元素比最大值还大，you can you up
       int max = array[0];
       int min = array[0];
       for (int i = 1; i < array.length; i++) {
		if (array[i] > max) {
			max = array[i];}
		if (array[i] < min) {
			min = array[i];}
       }
       System.out.println("最大值为" +max);
       System.out.println("最小值为" +min);
       System.out.println("数列为");
       NumCount numCount = new NumCount();
       Scanner input = new Scanner(System.in);
       System.out.println("请输入数列个数");
       int num = input.nextInt();
       numCount.Numcount(num);
       System.out.println("请输入要查找的数字");
       int SearchNum = input.nextInt();
       numCount.SeacherNum(SearchNum, numCount.array);
       input.close();
	}
  
}
