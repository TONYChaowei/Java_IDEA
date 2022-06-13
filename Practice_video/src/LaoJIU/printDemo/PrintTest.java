package LaoJIU.printDemo;

import LaoJIU.printDemo.impl.A4PaperImpl;
import LaoJIU.printDemo.impl.B5PaperImpl;
import LaoJIU.printDemo.impl.ColorlnkBoxImpl;

/**
 * @ author:Tony
 * @ date 2022/6/12 9:59
 * @ version 1.0
 * @ description:TODO
 */
public class PrintTest {
    public static void main(String[] args) {
         Printer printer = new Printer();
         //为打印机安装纸张和墨盒
         printer.setInkbox(new ColorlnkBoxImpl());
         printer.setPaper(new B5PaperImpl());
         printer.print("测试内容");

    }

}
