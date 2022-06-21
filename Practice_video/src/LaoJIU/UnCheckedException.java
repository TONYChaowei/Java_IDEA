package LaoJIU;

import Han.test;

/**免检查异常
 * @ author:Tony
 * @ date 2022/6/15 21:01
 * @ version 1.0
 * @ description:TODO
 */


public class UnCheckedException {

    public static void main(String[] args) {
//        String value = null;    //遇到空指针异常5
//        System.out.println(value.toString());
        //将字符串转换换为数字
        String str = "abc";
        int value = Integer.parseInt(str);
        System.out.println(value);
        System.out.println();
        System.out.println();
    }
}
