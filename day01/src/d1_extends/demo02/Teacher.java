package d1_extends.demo02;

public class Teacher extends Person{
    private String bumen;

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public void fbwt() {
        System.out.println("发布问题");
    }
}
