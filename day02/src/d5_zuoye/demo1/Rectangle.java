package d5_zuoye.demo1;

public class Rectangle extends Shape{
    private double longs;
    private double wide;

    public Rectangle(double longs, double wide) {
        this.longs = longs;
        this.wide = wide;
    }

    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    public void area() {
        System.out.println("长方形的面积是:" + (longs * wide));
    }

    @Override
    public void perimeter() {
        System.out.println("长方形的周长是:" + ((longs + wide) * 2));
    }
}
