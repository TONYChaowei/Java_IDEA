/**
 * 
 */
package Advanced;


import java.util.Scanner;

/**
 * ������ϰ
 * @author Tony
 * @version 1.0
 * @data 2022��5��4������1:26:35
 * @conpyright The GeekTeam
 * @description �������һ�����飬����������ֵ����Сֵ
 */
public class MaxMinDemo {

	public static void main(String[] args) {
		int array[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int)(Math.random() * 10000)) % 1001;   //0 - 1000�������
		}
       for (int j = 0; j < array.length; j++) {
		System.out.printf("%d\t",array[j]);
	 }
       // 1.�����һ��Ԫ��Ϊ���ֵ/��Сֵ
       // 2.�����ֵ/����Сֵ�������н��бȽϣ����ĳ��Ԫ�ر����ֵ����you can you up
       int max = array[0];
       int min = array[0];
       for (int i = 1; i < array.length; i++) {
		if (array[i] > max) {
			max = array[i];}
		if (array[i] < min) {
			min = array[i];}
       }
       System.out.println("���ֵΪ" +max);
       System.out.println("��СֵΪ" +min);
       System.out.println("����Ϊ");
       NumCount numCount = new NumCount();
       Scanner input = new Scanner(System.in);
       System.out.println("���������и���");
       int num = input.nextInt();
       numCount.Numcount(num);
       System.out.println("������Ҫ���ҵ�����");
       int SearchNum = input.nextInt();
       numCount.SeacherNum(SearchNum, numCount.array);
       input.close();
	}
  
}
