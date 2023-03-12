package d1_inner.demo5;

/*
目标：掌握匿名内部类作为参数传递的应用场景
应用场景：当调用一个方法时，形参是一个抽象类或者接口，为了简化代码书写，可以直接传递匿名内部类对象
 */
public class Demo {
    public static void main(String[] args) {
        //1.调用go方法，传递Swimming匿名内部类对象，打印蛙泳
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("蛙泳");

            }
        });
        //2.再次调用go方法，传递Swimming内部内部类对象，打印狗刨
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗刨");
            }
        });
    }

    public static void go(Swimming sw){
        System.out.println("开始~~~");
        sw.swim();
        System.out.println("结束~~~");
    }
}
