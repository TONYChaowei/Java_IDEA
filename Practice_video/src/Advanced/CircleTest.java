package Advanced;

import java.util.Scanner;

public class CircleTest {
	
	   public static void main(String[] args) {
		   System.out.print("������԰�İ뾶");
		   double r = new Scanner(System.in).nextDouble();
		   Circle circle = new Circle(r);
		   System.out.println("԰�����Ϊ" + circle.ClcCircles());
		   System.out.println("԰���ܳ�Ϊ" + circle.ClcCircle());
		   
	   }
       
}
