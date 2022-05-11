/**
 * 
 */
package Advanced;

/**
 * @author Tony
 * @version 1.0
 * @data 2022年5月5日下午4:20:58
 * @conpyright The GeekTeam
 * @description  洗牌小程序
 */
public class stuffCard {

	public static void main(String[] args) {
		final int N = 52;
		int cards[] = new int[N];     //52张牌
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;    //牌面与循环变量一致；0 - 51之间
		}
		String cardType[] = {"黑桃","红心","方块","梅花"};       //牌面类型
		String cardValue[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};   //牌面值
		System.out.println("洗牌前\n");
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%s-%s\t",cardType[cards[i] / 13] ,cardValue[cards[i] % 13]);
			if ((i + 1)% 13 == 0) {
				System.out.println(" ");
			}
		}
		System.out.println("\n洗牌后\n");
       //洗牌 随机生成一个0-52的数字newIndex
		for(int i = 0; i < cards.length ; i++) {
			int newIndex = (int)(Math.random() * N);
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;
		}
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%s-%s\t",cardType[cards[i] / 13] ,cardValue[cards[i] % 13]);
			if ((i + 1)% 13 == 0) {
				System.out.println(" ");
			}
		}
				
	}

}
