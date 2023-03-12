package d1_extends.demo07;
//子类
public class Student extends Person {
    private String school;

    public Student() {
    }

    public Student(String school) {
        this.school = school;
    }

    public Student(String name,int age,String school){
        super(name,age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

}
