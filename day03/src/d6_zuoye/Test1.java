package d6_zuoye;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test1 {
    public static void main(String[] args) {
        //1.求-10的绝对值
        System.out.println(Math.abs(-10));

        //2.对7.8向上取整
        System.out.println(Math.ceil(7.8));

        //3.对7.8向下取整
        System.out.println(Math.floor(7.8));

        //4.对3.5、3.1四舍五入
        System.out.println(Math.round(3.5));
        System.out.println(Math.floor(3.1));

        //5.获取7,，9两个数的最大值
        System.out.println(Math.max(7,9));


        //6.求2的3次幂
        System.out.println(Math.pow(2,3));


        //7.生产一个随机数 范围 [0.0, 1.0)
        System.out.println(Math.random());
    }
}
