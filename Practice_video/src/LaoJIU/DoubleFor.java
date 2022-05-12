/**
 * 
 */
package LaoJIU;

/**
 * 双循环 打印一个菱形
 * @author Tony
 * @version 1.0
 * @data 2022年5月1日下午5:16:35
 * @conpyright The GeekTeam
 * @description 
 */
public class DoubleFor {
	public static void main(String[] args) {
		char ch = 'A';
		 for(int i = 0 ; i < 4;i++) {
			 for(int j = 0; j <= 2 - i ;j++) {
				 
				 System.out.print(" ");
			 }
			 for(int j = 0; j <= 2 * i ;j++) {
				 System.out.print((char)ch++);
			 }
			 System.out.println("");
		 }
		  for(int i = 0 ;i < 3; i++) {
			  for(int j = 0 ;j <= i; j++) {
				  System.out.print(" ");
			  }
			  for(int j = 0 ; j <= 4 - 2 * i; j++) {
				  System.out.print((char)ch++ );
			  }
			  System.out.println("");
		  }

	}

}
