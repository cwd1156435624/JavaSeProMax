package d4_interface.demo3;

/*
目标：JDK8对接口新增的功能
 */
public class Demo {
    public static void main(String[] args) {
        InterImpl im = new InterImpl();
        im.test1();
        im.test2();
        //im.test4();  私有方法不能再Inter接口之外调用

        //Inter里面的静态方法，用接口名调用
        Inter.test3();
    }
}
