
package LaoJIU;

import java.util.*;


/**
 * 
 * MoneyTotal   continue������
 * @author Tony
 * @version 1.0
 * @data 2022��5��1������12:23:44
 * @conpyright The GeekTeam
 * @description 
 *ѭ������5����ҵ����ѽ��
 *¼��������ж��Ƿ�С��500
 *�ۼ�С��500������*
 */
public class MoneyTotal {

	public static void main(String[] args) {
		int count = 0;
		double cost;
		int i;
		for( i = 1 ; i <= 5; i++) {
		  Scanner input = new Scanner(System.in);
		  System.out.printf("������ĵ�%d��ҵ����ѽ��",i);
		  cost = input.nextInt();
		  if(cost <= 500)
		  continue;       //ֱ������С��500���������ֱ����������500�����
		  count++;
		  if(i == 5)
		  input.close();
		}
		System.out.println("���ѽ���500����"+count);
	}
	
}
