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
         System.out.println("计算除法前");
         int result = Integer.MAX_VALUE;
         try {
              result = num1 /num2;  //检测里面的代码块会不会出现异常
         }catch (Exception e){
             System.err.println("异常信息" + e.getMessage());   //打印异常的信息
             //日志记录
         }
         System.out.println("计算除法后");
         return result;
     }

    public static void main(String[] args) {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        int result = exceptionDemo.division(6,0);
        System.out.println(result);
    }


}
