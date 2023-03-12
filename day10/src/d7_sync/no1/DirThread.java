package d7_sync.no1;

public class DirThread extends Thread {
    private Account account;

    public DirThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.drawMoney(100000);
    }
}
