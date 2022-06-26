/**
 * @ author:Tony
 * @ date 2022/5/23 16:59
 * @ version 1.0
 * @ description:TODO
 */
public class TestMain {
    public static void main(String[] args) {
         SingleMode singleMode = SingleMode.getInstance();
        System.out.println(singleMode.count);
//        singleMode.count++;
        SingleMode singleMode1 = SingleMode.getInstance();
        System.out.println(singleMode1.count);
        System.out.println(singleMode == singleMode1 );

    }
}
