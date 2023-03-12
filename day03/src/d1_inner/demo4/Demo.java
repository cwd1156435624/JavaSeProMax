package d1_inner.demo4;

/*
目标：掌握匿名内部类的格式，以及它的本质
格式：
    new 父类/接口(){
        重写父类/接口的方法
    }
 */
public class Demo {
    public static void main(String[] args) {
        //1.按照匿名内部类的格式，创建Animal的子类对象，并调用方法
        new Animal(){

            @Override
            public void eat() {
                System.out.println("狗吃肉");
            }
        }.eat();

        //2.使用匿名内部类创建Animal的子类对象，用变量接收，再用变量调用方法
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        };
        a.eat();
    }
}
