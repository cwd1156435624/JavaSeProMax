package d1_proxy.demo2;

//用户管理，实现具体的登录和注册操作
public class UserManager implements UserInterface {
    @Override
    public void login() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("登录成功");
    }

    @Override
    public void regist() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("注册成功");
    }
}
