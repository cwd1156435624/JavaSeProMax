package d5_zuoye.demo2;

public class NewPhone extends Phone implements Iplay{
    @Override
    public void playGames() {
        System.out.println("新手机可以玩游戏");
    }

    @Override
    public void ringUp() {
        System.out.println("新手机发送语音和图片");

    }

    @Override
    public void sendMessages() {
        System.out.println("新手机可以玩游戏");
    }
}
