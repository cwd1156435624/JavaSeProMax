package d4_zuoye.Demo3;

import java.util.Objects;

public class computer implements Comparable<computer>{
    private String brand;
    private int price;
    private String color;

    public computer() {
    }

    public computer(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        computer computer = (computer) o;

        if (price != computer.price) return false;
        if (!Objects.equals(brand, computer.brand)) return false;
        return Objects.equals(color, computer.color);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(computer c) {
        int num = this.getPrice() - c.getPrice();
        if (num == 0){
            //如果年龄相同，就按照姓名比较(按照字典顺序比较)
            num = this.getBrand().compareTo(c.getBrand());
        }
        return num;
    }
}
