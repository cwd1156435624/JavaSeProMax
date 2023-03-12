package d3_static.demo03;

public class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(String name, int age, String dept) {
        super(name, age, dept);
    }

    @Override
    public void work() {
        System.out.println("员工的职责是使劲敲代码!");
    }
}
