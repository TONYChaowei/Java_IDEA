package LaoJIU.printDemo;

import LaoJIU.printDemo.Iface.Paper;
import LaoJIU.printDemo.Iface.inkBox;

import java.lang.reflect.Type;

/**��ӡ���� - ʹ�ñ�׼��ī�к�ֽ�Ž��д�ӡ
 * @ author:Tony
 * @ date 2022/6/9 17:05
 * @ version 1.0
 * @ description:TODO
 */
public class Printer {
    private inkBox inkbox = null;      //��ӡ���е�ī��
    private Paper paper = null;        //��ӡ���е�ֽ��
    

  /**
   * @ author: Tony
   * @ date: 2022/6/12 9:19
   * @ param: content ���ݸ���ӡ����ӡ���ַ�������
   * @ return:
   */
    public void print(String content){
        if (inkbox == null || paper == null){
            System.out.println("ī�к�ֽ�ų��ִ����밲װ��ȷ������");
            return;
        }//��ӡ����
        String color = inkbox.getColor();
        String type = paper.getSize();
        System.out.println("����������"  + color + "��ɫ��");
        System.out.println("ʹ��ֽ�ţ�" + type);
        System.out.println("��ӡ���ݣ�" + content);
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
