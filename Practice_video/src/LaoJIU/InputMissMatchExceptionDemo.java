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
        System.out.println("������һ������");
        int age = -1;
        try{
            age = input.nextInt();
        }catch (Exception e){
            e.printStackTrace();  //�������Զ�ջ�ķ�ʽ��ӡ�쳣 ���Ƚ������
        }
        System.out.println("����������ǣ�" + age);
    }
}
