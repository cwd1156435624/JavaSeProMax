package d1_extends.demo01;

//学生类
public class Student extends Person{
    private String school;

    public void study() {
        System.out.println("键盘敲烂，月薪过万");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
