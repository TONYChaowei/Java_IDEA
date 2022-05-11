/**
 * 
 */
package LaoJIU;

import java.util.Scanner;

/**
 * ��д����������������ת�������ְ����
 * @author Tony
 * @version 1.0
 * @data 2022��5��6������7:56:30
 * @conpyright The GeekTeam
 * @description 
 */
public class WeekDay {

	public static void main(String[] args) {
		System.out.print("���������ڼ�");
		int weekday = new Scanner(System.in).nextInt();
		weekday = JudgeMent(weekday);
		WeekDayByChinese(weekday);
		WeekDayByEnglish(weekday);
		WeekDayByJanpanes(weekday);
	}
	 /**
	  * �����ڼ�ת���ɲ�ͬ������:Ӣ��/����/����
	  * @param weekday  �����������ڼ���������
	  */
	public static void WeekDayByChinese(int weekday) {
		String week[] = {"����һ","���ڶ�","������","������","������","������","������"};
		System.out.println("����:"+week[weekday - 1]);
	}
	public static void WeekDayByJanpanes(int weekday) {
		String week[] = {"������","��ҫ��","ˮҫ��","ľҫ��","��ҫ��","��ҫ��","��ҫ��"};
		System.out.println("�ձ��Z:"+week[weekday - 1]);
	}
	public static void WeekDayByEnglish(int weekday) {
		String week[] = {"Monday","Tuesday","Wednesday","Tursday","Friday","Satday","Sunday"};
		System.out.println("English:"+week[weekday - 1]);
    }
	public static int JudgeMent(int choice) {
		while (choice > 7 || choice <= 0) {
			System.out.print("�����������1-7֮����������");
			choice = new Scanner(System.in).nextInt();
		}
		return choice;
	}
}
