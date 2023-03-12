package d3_collections;

public class Poker {
    private String num;
    private String color;
    private int order;

    public Poker() {
    }

    public Poker(String num, String color) {
        this.num = num;
        this.color = color;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        if (num == "小王" || num == "大王"){
            return num;
        }else {
            return num + color;
        }
    }
}
