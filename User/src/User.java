/**
 * 实现一个用户注册功能
 * @ author:Tony
 * @ date 2022/5/14 16:00
 * @ version 1.0
 * @ description:实现一个用户注册功能
 *  1.用户名最多25个字符长度，不能包含空格，单双引号 问号等特殊符号
 *  2.密码6-18位，只能包含字母，数字，特殊符号（下划线 @，#，$，！）
 *      纯数字，纯字母，密码强度都是弱 **
 *      数字 + 密码，数字 + 符号， 数字 + 字母 强度为中 ***
 *      同时存在三种字符，强度为强 *****
 *  3.用户输入正确的Email
 *      必须包含@符号，且只能包含一个
 *      *@和.符号不能再开头，也不能在结尾
 */
public class User {
    private String username;
    private String password;
    private String email;
    public User(){}
    public User(String username, String password, String email){
         setEmail(email);
         setPassword(password);
         setUsername(username);
    }
    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {

    }
}
