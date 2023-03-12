package d4_interface.demo3;

public interface Inter {
    //常量
    public static final int num =10;

    //抽象方法：被public abstract修饰，实现类必须重写
    public abstract void test1();

    //默认方法：被 public default修饰，实现类可选重写
    public default void test2(){
        System.out.println("Inter...test2执行了");
    }

    //静态方法： 被 public static修饰的方法
    public static void test3(){
        System.out.println("Inter...test3执行了");
    }

    //私有方法：被 private修饰，只能在本接口中被使用
    private void test4(){
        System.out.println("Inter...test4执行了");
    }
}
