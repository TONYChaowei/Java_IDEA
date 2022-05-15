import java.util.Scanner;

/**
 * 主方法
 * @ author:Tony
 * @ date 2022/5/14 16:37
 * @ version 1.0
 * @ description:TODO
 */
public class UserMain {
    public static void main(String[] args) {
        Tool tool = new Tool();
        User user = new User();

        boolean judged;
        Scanner input = new Scanner(System.in);
        System.out.println("请设定昵称");
        String username = input.nextLine();
        judged = tool.isCorrectUserName(username);
        while (!judged){
            System.out.println("请重新设定昵称，不能含有空格 单双引号 问号 *号等特殊符号哟");
            String usernames = input.nextLine();
            judged = tool.isCorrectUserName(usernames);


           System.out.println("请设定密码");
           String password = input.nextLine();
           String power = tool.validPassword(password);
           while ( power == ""){   //当密码强度为空时，则代表有问题
               System.out.println("请重新设定密码，密码长度不能大于18位，小于6位哟"+"\n"+ "只能包含以下符号 @ # $ ! < > .");
               String passwords = input.nextLine();
               power = tool.validPassword(passwords);
               password =passwords;
           }
           System.out.printf("您的密码安全等级：%s\n",power);
           System.out.println("账号注册成功！！");
           System.out.println(username);
           System.out.println(password);


    }
}
