package d5_zuoye.demo2;

public class OldPhone extends Phone{
    @Override
    public void ringUp() {
        System.out.println("普通的打电话功能");
    }

    @Override
    public void sendMessages() {
        System.out.println("普通的发短信功能");
    }
}
