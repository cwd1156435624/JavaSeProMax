package d1_tool;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int max = ArrayTool.getMax(arr);
        System.out.println(max);

        //用Math方法
        //获取圆周率,常量PI
        System.out.println(Math.PI);

        //Math类的方法全是静态方法，直接用类名调用即可
        //1.abs(int a):求一个数的绝对值
        System.out.println(Math.abs(-10));//10
        //2.max(int a,int b):求两个数的最大值
        System.out.println(Math.max(3,4));//4
        //3.min(int a,int b):求两个数的最小值
        System.out.println(Math.min(5,6));//5
        //4.floor(double a):返回比参数小的整数(向下取整)
        System.out.println(Math.floor(4.2));//4.0
        //5.ceil(double a):返回比参数大的整数(向上取整)
        System.out.println(Math.ceil(4.2));//5.0
        //6.round(double a):对小数进行四舍五入
        System.out.println(Math.round(5.5));//6
        //7.random():获取[0.0,1.0)范围内的随机数
        System.out.println(Math.random());
        //8.pow(double a,double b):求一个数的几次幂
        System.out.println(Math.pow(2,3));//2*2
        System.out.println(Math.pow(4,5));//4*4*4*4*4
    }
}
