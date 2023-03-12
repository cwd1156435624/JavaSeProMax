package d1_serialize;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private Student stu;

    public Person() {
    }

    public Person(String name, int age, Student stu) {
        this.name = name;
        this.age = age;
        this.stu = stu;
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

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stu=" + stu +
                '}';
    }
}
