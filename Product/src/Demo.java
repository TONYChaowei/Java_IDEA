import java.util.Scanner;

/**
*@ author:Tony
*@ date 2022/5/13 13:15
*@ version 1.0
*@ description:�ַ�����װ��
 * �ж��û�������ַ����ǲ��Ǻܸ�������
 * �����������İ�װ��
 *  Character.isLetter(ch);
 * Character.isLetterOrDigit();
 * Character.isDigit();
 * Character.isUpperCase();*/
public class Demo {
      public static  boolean isDigit(char ch){
            return  ch >= '0' && ch <= '9';
      }
      /*public static boolean isletter(char ch){  //�жϴ����ֵ�Ƿ�Ϊ��ĸ
            return isletter((int) ch);
      }*/

      public static void main(String[] args){

            boolean isDigits = true;  //�ж��Ƿ�Ϊһ��������
            System.out.println("�������ַ����������ж�");
            String value = new Scanner(System.in).nextLine();
            for (int i = 0; i < value.length(); i++) {
                  //if(!isDigit(value.charAt(i))){
                  if(Character.isDigit(value.charAt(i))){       //�ж��Ƿ�Ϊһ������
                        isDigits = false;
                        break;
                  }}
                  if(!isDigits){
                        System.out.println("�ⲻ��һ��������");
                  } else  {
                        System.out.println("����һ��������");
                  }

      }
}
