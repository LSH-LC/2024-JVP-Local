package test;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("결과: " + amount + "원이 입금되었습니다.");
        } else {
            System.out.println("입금할 금액이 잘못되었습니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("결과: " + amount + "원이 인출되었습니다.");
        } else {
            System.out.println("인출할 금액이 잘못되었거나 잔고가 부족합니다.");
        }
    }

    @Override
    public String toString() {
        return accountNumber + "\t" + accountHolder + "\t" + balance;
    }
}
