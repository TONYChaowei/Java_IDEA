package LaoJIU;

/**加强版字符串-带缓存的字符串
 * @ author:Tony
 * @ date 2022/5/15 15:23
 * @ version 1.0
 * @ description:TODO
 */
public class StringBufferDemo {
    public static void main(String[] args) {
            StringBuffer str1 = new StringBuffer("你好，成都");
            StringBuffer str2 = new StringBuffer("你好，武汉");
            System.out.println(str1.toString().equals(str2.toString()));
            System.out.println(str1.reverse());  //反转元素
            str1.insert(3,3);   //在规定的下标处插入元素
            System.out.println(str1);
            str2.deleteCharAt(3);
            str2.delete(2,4);
            System.out.println(str2);
    }
}
