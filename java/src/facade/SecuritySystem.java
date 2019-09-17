package facade;

/**
 * @author joy
 * @time 2019/09/17 10:44
 */
public class SecuritySystem {

    public void checkPwd(String pwd) {
        System.out.println("检查密码是否正确");
        if (pwd == "123456") {
            System.out.println("密码正确");
        } else {
            System.out.println("密码错误");
        }
    }
}
