package d4_interface.demo2;

public class Zi extends Fu implements Inter1  {
    @Override
    public void FuShow() {
        System.out.println("我是父类");
    }

    @Override
    public void test2() {
        System.out.println("我是test2");
    }

    @Override
    public void test3() {
        System.out.println("我是test3");
    }

    @Override
    public void test4() {
        System.out.println("我是test4");
    }
}
