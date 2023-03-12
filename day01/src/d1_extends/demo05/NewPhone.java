package d1_extends.demo05;

public class NewPhone extends Phone{
    @Override
    public void call() {
        super.call();
        System.out.println("新手机新增了视频通话");
    }

    @Override
    public void sendMsg() {
        super.sendMsg();
        System.out.println("新手机新增了发送图片");
    }
}
