package d7_sync.no1;

public class Account {
   private int balance;

    public Account() {
    }


    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }

    public void drawMoney(int money){
        Thread thread = new Thread();
        String name = Thread.currentThread().getName();

        synchronized (this){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (this.balance >= money){
                this.balance-=money;
                System.out.println(name + "取了" + money + "元");
            }else {
                System.out.println("余额不足");
            }
        }

    }
}
