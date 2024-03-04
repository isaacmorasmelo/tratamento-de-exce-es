package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawnLimit;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdrawn(double amount){
        balance -= amount;
    }

    public Account() {
    }

    public Account(int number, String holder, double balance, double withdrawnLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawnLimit = withdrawnLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawnLimit() {
        return withdrawnLimit;
    }

    public void setWithdrawnLimit(double withdrawnLimit) {
        this.withdrawnLimit = withdrawnLimit;
    }
}
