package d4_zuoye.zuoye1;

public class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(String name, String num, int salary) {
        super(name, num, salary);
    }

    @Override
    public void work() {
        System.out.println("敲代码");
    }
}
