package d3_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
目标：使用正则表达式爬取字符串中的满足要求的数据
需求：请把下面文本中的电话，邮箱，座机号码，热线都爬取出来。
 */
public class Demo4 {
    public static void main(String[] args) {
        String data = " 来黑马程序员学习Java，\n" +
                "        电话：1866668888，18699997777\n" +
                "        或者联系邮箱：boniu@itcast.cn，\n" +
                "        座机电话：01036517895，010-98951256\n" +
                "        邮箱：bozai@itcast.cn，\n" +
                "        邮箱：dlei0009@163.com，\n" +
                "        热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";
        // 1、定义爬取规则
        String regex = "[1][0-9]{10}|\\w{5,15}[@]\\w{2,8}([\\.]\\w{2,6})+|(010)-?\\d{5,10}|400-?\\d{3}-?\\d{4}";

        // 2、把正则表达式封装成一个Pattern对象
        Pattern pattern = Pattern.compile(regex);

        // 3、通过pattern对象去获取查找内容的匹配器对象。
        Matcher matcher = pattern.matcher(data);

        // 4、定义一个循环开始爬取信息
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
