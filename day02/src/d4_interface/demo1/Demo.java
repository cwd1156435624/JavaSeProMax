package d4_interface.demo1;

/*
目标：接口的定义、接口的基本使用
 */
public class Demo {
    public static void main(String[] args) {
        InterImpl im = new InterImpl();
        System.out.println(Inter.num);
        im.test();
    }
}
