package d1_extends.demo05;

//旧手机类
public class Phone {

    String name = "旧手机";

    /**
     * 打电话功能：语音通话
     */
    public void call() {
        System.out.println(name + "语音通话：您呼叫的用户正在通话中，请稍后再拨！");
    }

    /**
     * 发短信功能：发送文字
     */
    public void sendMsg() {
        System.out.println(name + "发送短信：黄天在上，我与赌毒不共戴天！");
    }
}
