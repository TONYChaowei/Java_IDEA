
package LaoJIU;
import java.util.Scanner;



/**
 * 实现简单的计算器功能：加减乘除 取模
 * @author Tony
 * @version 1.0
 * @data 2022年4月29日下午5:50:58
 * @conpyright The GeekTeam
 */

public class MyCalc {
	public static void main(String[] args) {
	    double num1,num2,result;
	    result = 0;
	    String op =" ";
	    String choice = null;
	    Scanner inchoice = new Scanner(System.in);   //接收用户输入的值
	    Scanner inop = new Scanner(System.in);
	    do {
	        	System.out.println("请输入两个数");
	      		Scanner inNum = new Scanner(System.in);
	      		num1 = inNum.nextDouble();
	      		num2 = inNum.nextDouble();
	      		inNum.close();
	      	    System.out.println("请输入运算符号");
	      	    
	      	    op = inop.nextLine();
	      	    switch(op) {
	      	    case "+":
	      	    	result = num1 + num2;
	      	    	break;
	      	    case"-":
	      	        result =num1 - num2;
	      	        break;
	      	    case"*":
	      	        result =num1 * num2;
	      	        
	      	        break;
	      	    case"/":
	      	    	if(num1 == 0) {
	      	        	result = 0;
	      	        	System.out.print("除数不能为0");
	      	        	return;
	      	        }
	      	       result = num1 / num2;
	      	       break;
	      	    case"%":
	      	    	result = num1 % num2;
	      	    	break;
	      	     default:
	      	    System.out.println("输入的字符有误");
	      	      break;
	      	    }
	      	     //打印结果
	            System.out.printf("%.2f %s %.2f结果为%.2f",num1,op,num2,result);
	      	    System.out.println("请选择是否继续运算（y/n)");
		    	
		    	choice = inchoice.next();         
	      	  }while("y".equalsIgnoreCase(choice));
	            inchoice.close();
	            inop.close();
		 
	      
	}

}
