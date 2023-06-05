public class SavingsAccount extends Account {
    int balance;

    public SavingsAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void transfer(Account account, int amount) {

    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println(getBalance());
    }
}
