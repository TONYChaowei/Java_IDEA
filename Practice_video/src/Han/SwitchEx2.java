/**
 * 
 */
package Han;
import java.util.Scanner;
/**
 * 根据打印的月份 打印所月对应的季节
 * @author Tony
 * @version 1.0
 * @data 2022年4月28日下午6:29:52
 * @conpyright The GeekTeam
 */
public class SwitchEx2 {

	public static void main(String[] args) {
         int mouth;
        System.out.println("请输入月份");
        Scanner in = new Scanner(System.in);
        mouth = in.nextInt();
        switch(mouth) {
        case 3:
        case 4:
        case 5:
        	System.out.println("春季");
        	break;
        case 6:
        case 7:
        case 8:
          	System.out.println("夏季");
          	break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
			
        default:
        	System.out.println("错误，请重新选择");
//        	 Scanner in = new Scanner(System.in);
//             mouth = in.nextInt();
        }
        in.close();
	}

}
