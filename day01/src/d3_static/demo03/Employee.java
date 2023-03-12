package d3_static.demo03;

/*
    员工类
 */
public class Employee {
    private String name;
    private int age;
    private String dept;

    public static final String companyNme = "黑马头条科技有限公司";

    public Employee() {
    }

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void work(){

    }
}
