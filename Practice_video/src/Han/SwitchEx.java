package Han;
import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		double score;
		System.out.println("请输入您的分数");
        Scanner in =new Scanner(System.in);
		score = in.nextDouble();
		
		if(score > 0 && score < 100) {
			switch((int)(score / 60)) {
			case 0:
				System.out.print("不及格\n");
				break;
			case 1:
				System.out.println("合格");
				break;
			}
			
		}
		in.close();
	}
    
}
