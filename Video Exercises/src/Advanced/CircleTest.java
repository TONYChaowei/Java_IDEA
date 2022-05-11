package Advanced;

import java.util.Scanner;

public class CircleTest {
	
	   public static void main(String[] args) {
		   System.out.print("请输入园的半径");
		   double r = new Scanner(System.in).nextDouble();
		   Circle circle = new Circle(r);
		   System.out.println("园的面积为" + circle.ClcCircles());
		   System.out.println("园的周长为" + circle.ClcCircle());
		   
	   }
       
}
