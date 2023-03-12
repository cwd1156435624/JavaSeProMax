package d5_zuoye.demo2;

public class Demo {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        op.ringUp();
        op.sendMessages();

        NewPhone np = new NewPhone();
        np.ringUp();
        np.sendMessages();
        np.playGames();
    }
}
