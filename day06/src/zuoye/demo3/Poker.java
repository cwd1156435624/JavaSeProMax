package zuoye.demo3;

public class Poker {
    private String number;
    private String color;
    private int order;

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Poker() {
    }

    public Poker(String number, String color) {
        this.number = number;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (getNumber() == "小王" || getNumber() == "大王"){
            return getNumber();
        }
        return getNumber() + getColor();
    }
}
