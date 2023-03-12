package d1_inner.demo1;

/*
目标：掌握成员内部类创建对象的格式
 */
public class Demo {
    public static void main(String[] args) {
        //2.创建Outer类里面Inner类的对象
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}
