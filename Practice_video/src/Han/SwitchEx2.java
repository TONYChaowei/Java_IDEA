/**
 * 
 */
package Han;
import java.util.Scanner;
/**
 * ���ݴ�ӡ���·� ��ӡ���¶�Ӧ�ļ���
 * @author Tony
 * @version 1.0
 * @data 2022��4��28������6:29:52
 * @conpyright The GeekTeam
 */
public class SwitchEx2 {

	public static void main(String[] args) {
         int mouth;
        System.out.println("�������·�");
        Scanner in = new Scanner(System.in);
        mouth = in.nextInt();
        switch(mouth) {
        case 3:
        case 4:
        case 5:
        	System.out.println("����");
        	break;
        case 6:
        case 7:
        case 8:
          	System.out.println("�ļ�");
          	break;
		case 9:
		case 10:
		case 11:
			System.out.println("�＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("����");
			break;
			
        default:
        	System.out.println("����������ѡ��");
//        	 Scanner in = new Scanner(System.in);
//             mouth = in.nextInt();
        }
        in.close();
	}

}
