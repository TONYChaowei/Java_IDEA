package Advanced;
import java.util.*;
/**
 * 
 * �����ʹ��
 * @author Tony
 * @version 1.0
 * @data 2022��5��3������1:38:15
 * @conpyright The GeekTeam
 * @description Ҫ���û���̬¼��5��ѧ���ĳɼ�����ƽ���ɼ�
 */
public class Array {

	public static void main(String[] args) {
		//�����������·����ڴ���׵�ַ 
		int scores[] = new int[5];
		int i;
		 int sum = 0;
		 double average;   //�ܳɼ���ƽ���ɼ�
		 
		 for( i = 0 ; i < scores.length ; i++) {
			 Scanner input = new Scanner(System.in);      //new:�ڶ��ڴ��з����˿ռ�
			 System.out.print("������ѧ���ĳɼ�");
			 scores[i]= input.nextInt();
			 input.close();
			 sum += scores[i];
		 }
		 average = sum / i;
		 System.out.print("ƽ���ɼ�Ϊ" + average);
		 

	}

}
