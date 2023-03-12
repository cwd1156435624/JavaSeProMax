package d5_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
目标：掌握BigDecimal除法运算保留指定位数的小数
 */
public class Demo2 {
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(3);

        //RoundingMode.Down方法，不管是否满5都去掉（去尾法）
        BigDecimal d1 = bd1.divide(bd2, 2, RoundingMode.DOWN);
        System.out.println(d1);

        //RoundingMode.UP方法，不管是否满5都进一（进一法）
        BigDecimal d2 = bd1.divide(bd2, 2, RoundingMode.UP);
        System.out.println(d2);

        //RoundingMode.HALF_UP方法，满5进一，不满5舍弃，（四舍五入）
        BigDecimal d3 = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(d3);
    }
}
