package d4_zuoye.zuoye2;

public class Dog extends animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("颜色为"+getColor()+"的"+getAge()+"岁的狗,在吃" + something);
    }

    public void lookHome(){
        System.out.println("会看家");
    }
}
