import java.util.Scanner;

/**
 * ������
 * @ author:Tony
 * @ date 2022/5/14 16:37
 * @ version 1.0
 * @ description:TODO
 */
public class UserMain {
    public static void main(String[] args) {
        Tool tool = new Tool();
<<<<<<< HEAD
=======
        User user = new User();
>>>>>>> LaoJIU
        boolean judged;
        Scanner input = new Scanner(System.in);
        System.out.println("���趨�ǳ�");
        String username = input.nextLine();
        judged = tool.isCorrectUserName(username);
        while (!judged){
            System.out.println("�������趨�ǳƣ����ܺ��пո� ��˫���� �ʺ� *�ŵ��������Ӵ");
            String usernames = input.nextLine();
            judged = tool.isCorrectUserName(usernames);
<<<<<<< HEAD
        }
       while (true){
           System.out.println("���趨����");
           String password = input.nextLine();
           String power = tool.validPassword(password);
           while (power == "" || power ==null){
               System.out.println("�������趨����");
               String passwords = input.nextLine();
               power = tool.validPassword(password);
           }
           System.out.printf("�������밲ȫ�ȼ���%s\n",power);
       }
        //System.out.println("�������������");
        //String email = input.nextLine();

            username = usernames;
        }

           System.out.println("���趨����");
           String password = input.nextLine();
           String power = tool.validPassword(password);
           while ( power == ""){   //������ǿ��Ϊ��ʱ�������������
               System.out.println("�������趨���룬���볤�Ȳ��ܴ���18λ��С��6λӴ"+"\n"+ "ֻ�ܰ������·��� @ # $ ! < > .");
               String passwords = input.nextLine();
               power = tool.validPassword(passwords);
               password =passwords;
           }
           System.out.printf("�������밲ȫ�ȼ���%s\n",power);
           System.out.println("�˺�ע��ɹ�����");
           System.out.println(username);
           System.out.println(password);

>>>>>>> LaoJIU
    }
}
