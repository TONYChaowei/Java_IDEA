package LaoJIU.printDemo;

import LaoJIU.printDemo.Iface.Paper;
import LaoJIU.printDemo.Iface.inkBox;

import java.lang.reflect.Type;

/**打印机类 - 使用标准的墨盒和纸张进行打印
 * @ author:Tony
 * @ date 2022/6/9 17:05
 * @ version 1.0
 * @ description:TODO
 */
public class Printer {
    private inkBox inkbox = null;      //打印机中的墨盒
    private Paper paper = null;        //打印机中的纸张
    

  /**
   * @ author: Tony
   * @ date: 2022/6/12 9:19
   * @ param: content 传递给打印机打印的字符串内容
   * @ return:
   */
    public void print(String content){
        if (inkbox == null || paper == null){
            System.out.println("墨盒和纸张出现错误，请安装正确后重试");
            return;
        }//打印过程
        String color = inkbox.getColor();
        String type = paper.getSize();
        System.out.println("以下文字是"  + color + "颜色：");
        System.out.println("使用纸张：" + type);
        System.out.println("打印内容：" + content);
    }

   /**
    * @ author: Tony
    * @ date: 2022/6/9 20:23
    * @ param: 
    * @ return: 
   */
    public inkBox getInkbox() {
        return inkbox;
    }

    public void setInkbox(inkBox inkbox) {
        this.inkbox = inkbox;
    }

    public Paper getPaperpaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
