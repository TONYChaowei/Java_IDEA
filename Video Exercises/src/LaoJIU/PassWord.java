/**
 * 
 */
package LaoJIU;
import java.util.*;
/**
 * ʹ��ѭ��ʵ�������������������˳�ϵͳ
 * @author Tony
 * @version 1.0
 * @data 2022��4��29������2:38:36
 * @conpyright The GeekTeam
 */
public class PassWord {
	public static void main(String[] args) {
		String password = "3045";
		String currinput;
		int i = 0;
		 System.out.println("����������"); 
		 Scanner in = new Scanner(System.in);
		 currinput = in.next();
		 while(i < 2) {
			 if(!password .equals(currinput)) {     //Java�е��ַ���Ӧ�������ж�
				 System.out.println("�����������������");
				 currinput = in.next();
				 i++;}
				 else{ 
					 System.out.println("������ȷ");
					 System.exit(0);
					 break;		
				 }
		 }
		 in.close();
		 System.out.println("������������������Σ�ϵͳ�˳�");
		 
	}
	  
}
