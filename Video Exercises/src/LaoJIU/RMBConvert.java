package LaoJIU;
import java.util.Scanner;
/**
 * ��������Ǯ���ֳɽ�С�Ļ��ҵ�λ
 * @author Tony
 * @version 1.0
 * @data 2022��4��28������10:47:45
 * @conpyright The GeekTeam
 */
public class RMBConvert {
     public static void main(String[] args) {
    	 System.out.print("������Ǯ������");
    	 Scanner input = new Scanner(System.in);
    	 double money = input.nextDouble();
    	 
    	 //�ȴ���԰�Ĳ���
    	 int yuan = (int)money;
    	 int shiyuan = yuan  / 10;      //ʮԪֽ�ҵ�����
    	 int wuyuan = yuan % 10 / 5;    //��Ԫֽ�ҵ�����
    	 int yiyuan = yuan % 10 % 5;    //һԪֽ�ҵ�����
    	 //��������ǵĲ���
    	 int yijiao;		 //һ��
    	 int wujiao;   		//���
    	 int jiao = ((int)(money * 10)) % 10;
    	 if(jiao < 5) {
    		 wujiao = 0;
    		 yijiao = jiao;
    	 }
    	 else {
    		  wujiao = jiao / 5;     //���ֽ�ҵ�����
        	  yijiao = jiao - 5;     //һ��ֽ�ҵ�����
    	 }
    	 System.out.println("10Ԫ��ֽ�ҵ�������"+ shiyuan);
    	 System.out.println("5Ԫ��ֽ�ҵ�������" + wuyuan   + "\n1Ԫ��ֽ�ҵ�������" + yiyuan);
    	 System.out.println("5�ǵ�ֽ�ҵ�������" + wujiao   + "\n1�ǵ�ֽ�ҵ�����" + yijiao);
    	 input.close();
     }
}
