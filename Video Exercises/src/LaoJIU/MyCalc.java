
package LaoJIU;
import java.util.Scanner;



/**
 * ʵ�ּ򵥵ļ��������ܣ��Ӽ��˳� ȡģ
 * @author Tony
 * @version 1.0
 * @data 2022��4��29������5:50:58
 * @conpyright The GeekTeam
 */

public class MyCalc {
	public static void main(String[] args) {
	    double num1,num2,result;
	    result = 0;
	    String op =" ";
	    String choice = null;
	    Scanner inchoice = new Scanner(System.in);   //�����û������ֵ
	    Scanner inop = new Scanner(System.in);
	    do {
	        	System.out.println("������������");
	      		Scanner inNum = new Scanner(System.in);
	      		num1 = inNum.nextDouble();
	      		num2 = inNum.nextDouble();
	      		inNum.close();
	      	    System.out.println("�������������");
	      	    
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
	      	        	System.out.print("��������Ϊ0");
	      	        	return;
	      	        }
	      	       result = num1 / num2;
	      	       break;
	      	    case"%":
	      	    	result = num1 % num2;
	      	    	break;
	      	     default:
	      	    System.out.println("������ַ�����");
	      	      break;
	      	    }
	      	     //��ӡ���
	            System.out.printf("%.2f %s %.2f���Ϊ%.2f",num1,op,num2,result);
	      	    System.out.println("��ѡ���Ƿ�������㣨y/n)");
		    	
		    	choice = inchoice.next();         
	      	  }while("y".equalsIgnoreCase(choice));
	            inchoice.close();
	            inop.close();
		 
	      
	}

}
