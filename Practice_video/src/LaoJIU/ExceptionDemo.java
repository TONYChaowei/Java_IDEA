package LaoJIU;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.Dictionary;

/**
 * @ author:Tony
 * @ date 2022/6/14 12:30
 * @ version 1.0
 * @ description:TODO
 */
public class ExceptionDemo {
     public int division(int num1, int num2){
         System.out.println("�������ǰ");
         int result = Integer.MAX_VALUE;
         try {
              result = num1 /num2;  //�������Ĵ����᲻������쳣
         }catch (Exception e){
             System.err.println("�쳣��Ϣ" + e.getMessage());   //��ӡ�쳣����Ϣ
             //��־��¼
         }
         System.out.println("���������");
         return result;
     }

    public static void main(String[] args) {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        int result = exceptionDemo.division(6,0);
        System.out.println(result);
    }


}
