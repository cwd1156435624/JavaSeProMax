package d1_inner.demo3;

public class Outer {
    public void show(){
        //1.在此处定义一个局部内部类Inner，并且在类中定义一个test方法
        class Inner{
            public void test(){
                System.out.println("阿巴阿巴阿巴");
            }
        }

        //2.在此处创建Inner的对象，并调用test方法
        Inner in = new Inner();
        in.test();
    }
}
