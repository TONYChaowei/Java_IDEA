package Advanced;

/**
 * ������ϰ
 * @author Tony
 * @version 1.0
 * @data 2022��5��4������12:56:30
 * @conpyright The GeekTeam
 * @description 쳲���������
 * 0��1��1��2��3��5��8��13��21��34��55��89��144
 * ���ɣ�ǰ����Ԫ��ֵ�̶����ӵ�����ֵ��ʼ����ǰ����Ԫ��֮��
 */
public class Ex {


	public static void main(String[] args) {
		int Array[]  = new int[20];
		Array[0] = 0;
		Array[1] = 1;
		for(int i = 2; i < Array.length; i++ ) {
			Array[i] = Array[i - 1] + Array[i - 2];  //�ӵ�����ֵ��ʼ����ǰ����Ԫ��֮��
		}
		System.out.println("��쳲����ҷָ�ս��");
		for(int i = 0;  i < Array.length ; i++) {
			System.out.printf("%d  ",Array[i]);
		}

	}

}
