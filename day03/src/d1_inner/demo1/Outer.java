package d1_inner.demo1;

public class Outer {
    //1.在此处定义一个成员内部类Inner
    int num = 10;
    public class Inner {
        int num = 20;
        public void show(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
