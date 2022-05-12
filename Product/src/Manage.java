import javax.swing.*;

/**
*@ author:Tony
*@ date 2022/5/12 16:25
*@ version 1.0
*@ description:商品的管理类
*/
public class Manage {
      public static void main(String[] args){
            int[] count = new int[1];
            double total = 0;             //需要支付的总金额
            for (int i = 0; i < count.length; i++) {
                  product pro = new product();
                  String name = JOptionPane.showInputDialog("请输入商品名称");
                  pro.setName(name);
                  String strprice = JOptionPane.showInputDialog("请输入商品单价");  //接收用户的商品单价，要注意，返回值是字符串类型
                  //需要将字符串类型转换为double类型，再进行赋值
                  pro.setPrice(Double.parseDouble(strprice));
                  String strCount = JOptionPane.showInputDialog("请输入购买的数量");
                  count[i] = Integer.parseInt(strCount);
                  //累加总金额
                  total += pro.getPrice() * count[i];


            }
            System.out.println("商品总金额为:" + total);
      }
}
