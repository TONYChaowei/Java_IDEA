package Advanced;

/**
 * 数组练习
 * @author Tony
 * @version 1.0
 * @data 2022年5月4日下午12:56:30
 * @conpyright The GeekTeam
 * @description 斐波拉且数列
 * 0，1，1，2，3，5，8，13，21，34，55，89，144
 * 规律：前两个元素值固定，从第三个值开始，是前两个元素之和
 */
public class Ex {


	public static void main(String[] args) {
		int Array[]  = new int[20];
		Array[0] = 0;
		Array[1] = 1;
		for(int i = 2; i < Array.length; i++ ) {
			Array[i] = Array[i - 1] + Array[i - 2];  //从第三个值开始，是前两个元素之和
		}
		System.out.println("以斐波拉且分割战场");
		for(int i = 0;  i < Array.length ; i++) {
			System.out.printf("%d  ",Array[i]);
		}

	}

}
