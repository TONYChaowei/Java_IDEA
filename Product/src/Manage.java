import javax.swing.*;

/**
*@ author:Tony
*@ date 2022/5/12 16:25
*@ version 1.0
*@ description:��Ʒ�Ĺ�����
*/
public class Manage {
      public static void main(String[] args){
            int[] count = new int[1];
            double total = 0;             //��Ҫ֧�����ܽ��
            for (int i = 0; i < count.length; i++) {
                  product pro = new product();
                  String name = JOptionPane.showInputDialog("��������Ʒ����");
                  pro.setName(name);
                  String strprice = JOptionPane.showInputDialog("��������Ʒ����");  //�����û�����Ʒ���ۣ�Ҫע�⣬����ֵ���ַ�������
                  //��Ҫ���ַ�������ת��Ϊdouble���ͣ��ٽ��и�ֵ
                  pro.setPrice(Double.parseDouble(strprice));
                  String strCount = JOptionPane.showInputDialog("�����빺�������");
                  count[i] = Integer.parseInt(strCount);
                  //�ۼ��ܽ��
                  total += pro.getPrice() * count[i];


            }
            System.out.println("��Ʒ�ܽ��Ϊ:" + total);
      }
}
