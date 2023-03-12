package d4_zuoye.zuoye2;

public class Demo {
    public static void main(String[] args) {
        Person p = new Person();
        Cat cat = new Cat(2,"白色");
        p.keepPet(cat,"小鱼干");
        Dog dog = new Dog(2,"黑色");
        p.keepPet(dog,"骨头");
    }

}
