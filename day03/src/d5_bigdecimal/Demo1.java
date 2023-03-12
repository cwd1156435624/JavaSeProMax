package d5_bigdecimal;

import java.math.BigDecimal;

/*
目标：掌握BigDecimal的四则运算
 */
public class Demo1 {
    public static void main(String[] args) {
        //问题：小数在进行运算时，由于底层存储原理，有精度损失问题.
        System.out.println(0.09+0.01);

        //需求：使用BigDecimal对0.09和0.01进行四则运算
        BigDecimal bd1 = BigDecimal.valueOf(0.09);
        BigDecimal bd2 = BigDecimal.valueOf(0.01);

        //1.求和
        BigDecimal sum = bd1.add(bd2);
        System.out.println(sum);

        //2.求差
        BigDecimal sub = bd1.subtract(bd2);
        System.out.println(sub);

        //3.乘法
        BigDecimal mul = bd1.multiply(bd2);
        System.out.println(mul);

        //4.除法
        BigDecimal div = bd1.divide(bd2);
        System.out.println(div);
    }
}
