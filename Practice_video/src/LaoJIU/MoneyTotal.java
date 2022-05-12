
package LaoJIU;

import java.util.*;


/**
 * 
 * MoneyTotal   continue的妙用
 * @author Tony
 * @version 1.0
 * @data 2022年5月1日下午12:23:44
 * @conpyright The GeekTeam
 * @description 
 *循环输入5个玩家的消费金额
 *录入后立即判断是否小于500
 *累计小于500的数量*
 */
public class MoneyTotal {

	public static void main(String[] args) {
		int count = 0;
		double cost;
		int i;
		for( i = 1 ; i <= 5; i++) {
		  Scanner input = new Scanner(System.in);
		  System.out.printf("请输入的第%d玩家的消费金额",i);
		  cost = input.nextInt();
		  if(cost <= 500)
		  continue;       //直接跳过小于500金额的情况，直接跳到大于500的情况
		  count++;
		  if(i == 5)
		  input.close();
		}
		System.out.println("消费金额超过500的有"+count);
	}
	
}
