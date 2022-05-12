package LaoJIU;
import java.util.Scanner;
/**
 * 将给定的钱数分成较小的货币单位
 * @author Tony
 * @version 1.0
 * @data 2022年4月28日上午10:47:45
 * @conpyright The GeekTeam
 */
public class RMBConvert {
     public static void main(String[] args) {
    	 System.out.print("请输入钱的数量");
    	 Scanner input = new Scanner(System.in);
    	 double money = input.nextDouble();
    	 
    	 //先处理园的部分
    	 int yuan = (int)money;
    	 int shiyuan = yuan  / 10;      //十元纸币的数量
    	 int wuyuan = yuan % 10 / 5;    //五元纸币的数量
    	 int yiyuan = yuan % 10 % 5;    //一元纸币的数量
    	 //再来处理角的部分
    	 int yijiao;		 //一角
    	 int wujiao;   		//五角
    	 int jiao = ((int)(money * 10)) % 10;
    	 if(jiao < 5) {
    		 wujiao = 0;
    		 yijiao = jiao;
    	 }
    	 else {
    		  wujiao = jiao / 5;     //五角纸币的数量
        	  yijiao = jiao - 5;     //一角纸币的数量
    	 }
    	 System.out.println("10元的纸币的数量："+ shiyuan);
    	 System.out.println("5元的纸币的数量：" + wuyuan   + "\n1元的纸币的数量：" + yiyuan);
    	 System.out.println("5角的纸币的数量：" + wujiao   + "\n1角的纸币的数量" + yijiao);
    	 input.close();
     }
}
