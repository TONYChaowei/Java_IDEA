import javax.swing.*;
/**
 * @ author:Tony
 * @ date 2022/5/12 16:25
 * @ version 1.0
 * @ description:��Ʒ�Ĺ�����
 */
public class Manage {
    public static void main(String[] args) {
        int[] count = new int[2];
        double total = 0;             //��Ҫ֧�����ܽ��
        product[] pro = new product[2];  //ʹ�ö�������
        for (int i = 0; i < pro.length; i++) {
            pro[i] = new product();     //��������ʹ��֮ǰ��һ���ǵ�Ҫ����ռ�
            String name = JOptionPane.showInputDialog("��������Ʒ����");
            pro[i].setName(name);
            String strprice = JOptionPane.showInputDialog("��������Ʒ����");  //�����û�����Ʒ���ۣ�Ҫע�⣬����ֵ���ַ�������
            //��Ҫ���ַ�������ת��Ϊdouble���ͣ��ٽ��и�ֵ ע��ת��ǰ��ý�����֤
            pro[i].setPrice(Double.parseDouble(strprice));
            String strCount = JOptionPane.showInputDialog("�����빺�������");
            count[i] = Integer.parseInt(strCount);
            //�ۼ��ܽ��
            total += pro[i].getPrice() * count[i];
        }
        System.out.println("�������");
        for (int i = 0; i < pro.length; i++) {
            System.out.println(pro[i].getName() + "\t" + pro[i].getPrice() + "\t" + "��Ʒ�ܽ��Ϊ:" + pro[i].getPrice());
        }
        System.out.println("��Ʒ�ܽ��Ϊ:" + total);
    }
}
