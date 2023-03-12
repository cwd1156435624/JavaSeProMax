package d5_zuoye.demo1;

public class Round extends Shape{
    private double R;

    public Round(double r) {
        this.R = r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public void area() {
        System.out.println("圆的面积是:" + (Math.pow(R,2) * 3.14));
    }

    @Override
    public void perimeter() {
        System.out.println("圆的周长是:" + (2*R * 3.14));
    }
}
