package Advanced;

import java.util.Scanner;

/** 
 * @author Tony
 * @version 1.0
 * @data 2022年5月7日下午5:13:38
 * @conpyright The GeekTeam
 * @description
 * 使用面向对象的方式创建一个园的类，分别计算周长和面积
 */

public class Circle {
       public  double PI = 3.1415926;
       public double r;              //园的半径
       public Circle() {}   		//默认构造器
       public Circle(double r1) {  //构造器
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
 			System.out.print("输入错误，请输入正确的半径");
 		    r = new Scanner(System.in).nextDouble();
 		}
 	}
       
}
