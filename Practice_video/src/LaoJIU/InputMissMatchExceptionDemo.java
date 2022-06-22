package LaoJIU;

import java.util.Scanner;

/**
 * @ author:Tony
 * @ date 2022/6/14 12:30
 * @ version 1.0
 * @ description:TODO
 */
public class InputMissMatchExceptionDemo {
    /**
     * @ author Tony
     * @ date 2022/6/21 21:22
     * * @param null
     * @ return 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整型");
        int age = -1;
        try{
            age = input.nextInt();
        }catch (Exception e){
            e.printStackTrace();  //这里是以堆栈的方式打印异常 （先进后出）
        }
        System.out.println("输入的年龄是：" + age);
    }
}
