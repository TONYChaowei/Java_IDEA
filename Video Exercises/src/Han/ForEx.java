/**
 * 
 */
package Han;

/* for ѭ������
 * ��ӡ1 -100֮����Ǿű��������� ͳ�Ƹ���
 * @author Tony
 * @version 1.0
 * @data 2022��4��28������10:47:28
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
		System.out.println("�ܺ�Ϊ " +sum);
		System.out.println("����Ϊ " +count);
	}

}

