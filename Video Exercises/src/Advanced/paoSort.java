/**
 * 
 */
package Advanced;

import java.util.Scanner;

/**
 *ð������\ѡ������\���ֲ���
 * @author Tony
 * @version 1.0
 * @data 2022��5��4������10:36:26
 * @conpyright The GeekTeam
 * @description 
 * 1.һ����Ƚ�����Ԫ�ظ���-1��
 * 2.ÿһ�֣��ȽϵĴ�������һ����һ
 * 3.���ǰ��һ���������/С�ں����һ�����֣���ô����	
 */
public class paoSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sort[] = new int[10];
		paoSort method  =new paoSort();    //����һ��paoSort�Ķ��󣬲���������ķ���
		for (int i = 0; i < sort.length; i++) {    //�������һ������
			 sort[i] = (int)(Math.random() * 100);
		}
		System.out.println("����ǰ");	    
		method.Print(sort);
	   
	    for (int i = 0; i < sort.length - 1; i++) {
			for (int j = 0; j < sort.length - 1 - i; j++) {
				if (sort[j + 1] < sort[j]) {
					int temp = sort[j];
					sort[j ] = sort[j + 1];
					sort[j + 1] = temp;	}	
			     }
			}
			 System.out.println(" ");
			 System.out.println("ð�������");
			  method.Print(sort);
			System.out.println(" ");
		  System.out.println("ѡ�������");
		  choiceSort choicesort = new choiceSort();
		  choicesort.sort(sort);
		  method.Print(sort);
//		  System.out.println("��ѡ��Ҫ���ҵ�����");
		   Scanner input = new Scanner(System.in);
//		   int seachNum = input.nextInt();
//		   choicesort.BinarySearch(sort, seachNum);
		   System.out.println("\n������Ҫɾ��������");
		   int delNum = input.nextInt();
		   choicesort.DeleteNum(delNum, sort);
		   input.close();
	    }
	
	//��ӡ����
	void Print(int sort[]) {
		for (int i = 0; i < sort.length; i++) {
			System.out.print(" " + sort[i]);}
	     }
     }
	   

