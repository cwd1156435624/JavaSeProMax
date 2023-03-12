package d1_proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 需求
    现有同事已经开发好了用户登录和注册功能：
        已有UserInterface接口，声明了login()登录、regist()注册方法
        已有UserManager实现了UserInterface接口，重写了login()和regist()方法，实现了登录和注册功能,其中：
            登录：输出”登录成功”
            注册：输出”注册成功”
    要求利用动态代理技术，在不改变同事代码的情况下，统计login()方法和regist()方法的执行耗时：
 分析
    1 创建UserManager目标对象
    2 使用Proxy.newProxyInstance()为目标对象创建代理对象
    3 在InvocationHandler的invoke方法中定义代理规则
    4 调用代理对象的login()和regist()方法
 */
public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        UserManager um = new UserManager();

        UserInterface umProxy = (UserInterface) Proxy.newProxyInstance(
                um.getClass().getClassLoader(),
                new Class[]{UserInterface.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long time1 = System.currentTimeMillis();
                        Object result = method.invoke(um, args);
                        long time2 = System.currentTimeMillis();
                        System.out.println(method.getName() + "执行耗时:" + (time2 - time2) + "毫秒");
                        return result;
                    }
                }
        );

        umProxy.login();
        umProxy.regist();
    }
}
