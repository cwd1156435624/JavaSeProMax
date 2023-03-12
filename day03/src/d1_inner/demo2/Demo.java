package d1_inner.demo2;

/*
目标：掌握静态内部类创建对象的格式
 */
public class Demo {
    public static void main(String[] args) {
        //2.创建Outer里面Inner的对象，Inner是static修饰的
        Outer.Inner in = new Outer.Inner();
        in.show();


        //3.调用Inner类中的静态方法show
        Outer.Inner.show();
    }
}
