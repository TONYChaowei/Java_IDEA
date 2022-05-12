/**
 * 
 */
package Advanced;

/**
 * @author Tony
 * @version 1.0
 * @data 2022��5��5������4:20:58
 * @conpyright The GeekTeam
 * @description  ϴ��С����
 */
public class stuffCard {

	public static void main(String[] args) {
		final int N = 52;
		int cards[] = new int[N];     //52����
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;    //������ѭ������һ�£�0 - 51֮��
		}
		String cardType[] = {"����","����","����","÷��"};       //��������
		String cardValue[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};   //����ֵ
		System.out.println("ϴ��ǰ\n");
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%s-%s\t",cardType[cards[i] / 13] ,cardValue[cards[i] % 13]);
			if ((i + 1)% 13 == 0) {
				System.out.println(" ");
			}
		}
		System.out.println("\nϴ�ƺ�\n");
       //ϴ�� �������һ��0-52������newIndex
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
