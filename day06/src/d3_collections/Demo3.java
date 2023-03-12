package d3_collections;

import java.util.ArrayList;
import java.util.Collections;

/*
目标：斗地主发牌案例
需求：总共有54张牌
    点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2“
    花色: "♠", "♥", "♣", "♦“
    大小王: "👲" , "🃏“
    斗地主：发出51张牌，剩下3张做为底牌。

    要求：在启动游戏房间的时候，应该提前准备好54张牌，接着，需要完成洗牌、发牌、对牌排序、看牌。

 */
public class Demo3 {
    //定义一个集合用来装牌
    private static ArrayList<Poker> box = new ArrayList<>();
    //这是准备牌的代码块
    static {
        //这是数值
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //这是花色
        String[] color = {"♠","♥","♣","♦"};
        //定义一个序号，用来排序
        int order = 0;
        //遍历所有点数
        for (String number : numbers) {
            //遍历所有花色
            for (String co : color) {
                //给Poker赋值
                Poker poker = new Poker(number,co);
                poker.setOrder(order);
                order++;
                //添加到box
                box.add(poker);
            }
        }
        //大王和小王单独添加
        Poker poker1 = new Poker();
        poker1.setNum("小王");
        poker1.setOrder(order++);
        Poker poker2 = new Poker();
        poker2.setNum("大王");
        poker2.setOrder(order);
        box.add(poker1);
        box.add(poker2);

    }

    public static void main(String[] args) {
        //洗牌,使用shuffle方法打乱集合
        Collections.shuffle(box);

        //创建三个玩家的牌和底牌的集合
        ArrayList<Poker> player1 = new ArrayList<>();
        ArrayList<Poker> player2 = new ArrayList<>();
        ArrayList<Poker> player3 = new ArrayList<>();
        ArrayList<Poker> dipai = new ArrayList<>();
        
        //发牌
        for (int i = 0; i < box.size(); i++) {
            if (i< box.size() - 3){
                if (i%3==0){
                    player1.add(box.get(i));
                }else if (i%3==1){
                    player2.add(box.get(i));
                }else if (i%3==2){
                    player3.add(box.get(i));
                }
            }else {
                dipai.add(box.get(i));
            }
        }

        //排序
        Collections.sort(player1,(o1, o2) -> o1.getOrder() - o2.getOrder());
        Collections.sort(player2,(o1, o2) -> o1.getOrder() - o2.getOrder());
        Collections.sort(player3,(o1, o2) -> o1.getOrder() - o2.getOrder());
        Collections.sort(dipai,(o1, o2) -> o1.getOrder() - o2.getOrder());


        //看牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);


    }
}
