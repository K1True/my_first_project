import java.util.Scanner;


public class exam_login implements Comparable{
    //    已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录成功与否，给出相应的提示
    //    步骤:
    //            1.先定义两个字符串,表示注册过的用户名和密码
    //  2.创建Scanner对象,键盘录入用户名和密码
    //  3.比较,如果输入的用户名和密码跟已经注册过的用户名和密码内容一样,就登录成功,否则就登录失败
    private static String username;
    private static String password;

    public static void main(String[] args) {
        String saved_username = "admin";
        String saved_password = "123456";
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();
        password = sc.nextLine();
        if(username.equals(saved_username)&password.equals((saved_password))){
            System.out.println("登录成功");
        };
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
