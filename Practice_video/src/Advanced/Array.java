package Advanced;
import java.util.*;
/**
 * 
 * 数组的使用
 * @author Tony
 * @version 1.0
 * @data 2022年5月3日下午1:38:15
 * @conpyright The GeekTeam
 * @description 要求用户动态录入5个学生的成绩，求平均成绩
 */
public class Array {

	public static void main(String[] args) {
		//数组名就是新分配内存的首地址 
		int scores[] = new int[5];
		int i;
		 int sum = 0;
		 double average;   //总成绩的平均成绩
		 
		 for( i = 0 ; i < scores.length ; i++) {
			 Scanner input = new Scanner(System.in);      //new:在堆内存中分配了空间
			 System.out.print("请输入学生的成绩");
			 scores[i]= input.nextInt();
			 input.close();
			 sum += scores[i];
		 }
		 average = sum / i;
		 System.out.print("平均成绩为" + average);
		 

	}

}
