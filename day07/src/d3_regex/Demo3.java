package d3_regex;


/*
目标：正则表达式综合案例
需求1：使用正则表达式，校验电话号码（手机|座机）是否合法
      比如：18676769999、010-3424242424、0104644535 都是合法的

需求2：使用正则表达式，校验邮箱账号是否合法
      比如：itheima0009@163.com、itheima@itcast.com.cn、25143242@qq.com 都是合法的
 */
public class Demo3 {
    public static void main(String[] args) {
        //校验电话号码（手机|座机）是否合法
        String phoneNum = "15697213978";
        boolean b1 = phoneNum.matches("[1][0-9]{10}|(010)-?\\d{5,15}");
        System.out.println(b1);

        //校验邮箱账号是否合法
        String email = "itheima0009@163.com";
        boolean b2 = email.matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
        System.out.println(b2);

    }
}
