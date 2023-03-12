package d7_sync.no2;

public class MyRunnable implements Runnable {
    //持有的账号
    Account account;
    //要取出的钱
    int money;

    public MyRunnable(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        dirmoney();
    }

    public synchronized void dirmoney(){
        if (money <= account.getBalance()) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.setBalance(account.getBalance() - money);
            System.out.println(Thread.currentThread().getName() + "取出" + money);
        } else {
            System.out.println(Thread.currentThread().getName() + "取钱时，余额不足");
        }
        System.out.println("剩余：" + account.getBalance());
    }
}
