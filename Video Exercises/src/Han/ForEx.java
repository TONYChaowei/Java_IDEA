/**
 * 
 */
package Han;

/* for 循环控制
 * 打印1 -100之间的是九倍数的整数 统计个数
 * @author Tony
 * @version 1.0
 * @data 2022年4月28日下午10:47:28
 * @conpyright The GeekTeam
 */
public class ForEx {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		int count = 0;
		for(i = 1; i <= 100; i++) {
			if(i % 9 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("总和为 " +sum);
		System.out.println("个数为 " +count);
	}

}

