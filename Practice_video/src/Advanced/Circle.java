package Advanced;

import java.util.Scanner;

/** 
 * @author Tony
 * @version 1.0
 * @data 2022��5��7������5:13:38
 * @conpyright The GeekTeam
 * @description
 * ʹ���������ķ�ʽ����һ��԰���࣬�ֱ�����ܳ������
 */

public class Circle {
       public  double PI = 3.1415926;
       public double r;              //԰�İ뾶
       public Circle() {}   		//Ĭ�Ϲ�����
       public Circle(double r1) {  //������
    	   r = r1;                 
       }
    
     public double ClcCircles() {
    	   this.jugement();
		   return PI * (r *r);				
	   }
     public double ClcCircle() {
    	   jugement();
		   return 2 * PI *r;
	}
     public  void jugement() {
 		while (r <= 0) {
 			System.out.print("���������������ȷ�İ뾶");
 		    r = new Scanner(System.in).nextDouble();
 		}
 	}
       
}
