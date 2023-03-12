package d1_inner.demo2;

/*
目标：掌握静态内部类的定义格式，和创建对象的格式
 */
public class Outer {
    //1.在此处定义一个静态内部类Inner
    //2.再到Inner类中定义一个静态方法show
    public static class Inner{
        public static void show(){
            System.out.println("阿巴阿巴");
        }
    }
}
