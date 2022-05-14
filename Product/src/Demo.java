import java.util.Scanner;

/**
*@ author:Tony
*@ date 2022/5/13 13:15
*@ version 1.0
*@ description:字符串包装类
 * 判断用户输入的字符串是不是很个纯数字
 * 自行完成下面的包装类
 *  Character.isLetter(ch);
 * Character.isLetterOrDigit();
 * Character.isDigit();
 * Character.isUpperCase();*/
public class Demo {
      public static  boolean isDigit(char ch){
            return  ch >= '0' && ch <= '9';
      }
      /*public static boolean isletter(char ch){  //判断传入的值是否为字母
            return isletter((int) ch);
      }*/

      public static void main(String[] args){

            boolean isDigits = true;  //判断是否为一个纯数字
            System.out.println("请输入字符串，我来判断");
            String value = new Scanner(System.in).nextLine();
            for (int i = 0; i < value.length(); i++) {
                  //if(!isDigit(value.charAt(i))){
                  if(Character.isDigit(value.charAt(i))){       //判断是否为一个数字
                        isDigits = false;
                        break;
                  }}
                  if(!isDigits){
                        System.out.println("这不是一个纯数字");
                  } else  {
                        System.out.println("这是一个纯数字");
                  }

      }
}
