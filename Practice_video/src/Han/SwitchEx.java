package Han;
import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		double score;
		System.out.println("���������ķ���");
        Scanner in =new Scanner(System.in);
		score = in.nextDouble();
		
		if(score > 0 && score < 100) {
			switch((int)(score / 60)) {
			case 0:
				System.out.print("������\n");
				break;
			case 1:
				System.out.println("�ϸ�");
				break;
			}
			
		}
		in.close();
	}
    
}
