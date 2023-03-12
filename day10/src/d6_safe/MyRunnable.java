package d6_safe;

public class MyRunnable implements Runnable{
    private Account account;
    private int money;

    public MyRunnable(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        if (account.getBalance() >= money){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            account.setBalance(account.getBalance() - money);
            System.out.println(Thread.currentThread().getName()+"取了" + money +"元");
        }
        System.out.println("余额还剩" + account.getBalance()+"元");
    }
}
