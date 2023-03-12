package d4_zuoye.zuoye1;

//员工类
public class Employee {
    private String name;
    private String num;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String num, int salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){

    }
}
