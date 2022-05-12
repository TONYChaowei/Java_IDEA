/**
 * 
 */
package LaoJIU;

import java.util.Scanner;

/**
 * 书写方法，将数字星期转换成文字版输出
 * @author Tony
 * @version 1.0
 * @data 2022年5月6日下午7:56:30
 * @conpyright The GeekTeam
 * @description 
 */
public class WeekDay {

	public static void main(String[] args) {
		System.out.print("请输入星期几");
		int weekday = new Scanner(System.in).nextInt();
		weekday = JudgeMent(weekday);
		WeekDayByChinese(weekday);
		WeekDayByEnglish(weekday);
		WeekDayByJanpanes(weekday);
	}
	 /**
	  * 将星期几转换成不同的语言:英语/日语/中文
	  * @param weekday  传入数字星期几（参数）
	  */
	public static void WeekDayByChinese(int weekday) {
		String week[] = {"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
		System.out.println("中文:"+week[weekday - 1]);
	}
	public static void WeekDayByJanpanes(int weekday) {
		String week[] = {"月曜日","火耀日","水耀日","木耀日","金耀日","土耀日","日耀日"};
		System.out.println("日本語:"+week[weekday - 1]);
	}
	public static void WeekDayByEnglish(int weekday) {
		String week[] = {"Monday","Tuesday","Wednesday","Tursday","Friday","Satday","Sunday"};
		System.out.println("English:"+week[weekday - 1]);
    }
	public static int JudgeMent(int choice) {
		while (choice > 7 || choice <= 0) {
			System.out.print("输入错误请在1-7之间重新输入");
			choice = new Scanner(System.in).nextInt();
		}
		return choice;
	}
}
