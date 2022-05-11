/**
 * 
 */
package LaoJIU;
import java.util.*;
/**
 * 使用循环实现输入三次密码错误就退出系统
 * @author Tony
 * @version 1.0
 * @data 2022年4月29日下午2:38:36
 * @conpyright The GeekTeam
 */
public class PassWord {
	public static void main(String[] args) {
		String password = "3045";
		String currinput;
		int i = 0;
		 System.out.println("请输入密码"); 
		 Scanner in = new Scanner(System.in);
		 currinput = in.next();
		 while(i < 2) {
			 if(!password .equals(currinput)) {     //Java中的字符串应该这样判断
				 System.out.println("密码错误，请重新输入");
				 currinput = in.next();
				 i++;}
				 else{ 
					 System.out.println("密码正确");
					 System.exit(0);
					 break;		
				 }
		 }
		 in.close();
		 System.out.println("密码输入次数超过三次，系统退出");
		 
	}
	  
}
