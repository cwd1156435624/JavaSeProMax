package d1_extends.demo02;

public class Student extends Person{
    private String classes;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void tkfk(){
        System.out.println("填写听课反馈");
    }
}
