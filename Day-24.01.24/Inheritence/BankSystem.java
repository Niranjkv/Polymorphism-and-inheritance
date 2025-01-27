package Inheritence;

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

class SavingsAccount extends BankAccount {
    private double minimumBalance;

    public SavingsAccount(String accountNumber, double balance, double minimumBalance) {
        super(accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }

    public void checkMinimumBalance() {
        if (balance < minimumBalance) {
            System.out.println("Below minimum balance!");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void useOverdraft(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Overdraft used: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("S123", 5000, 1000);
        CurrentAccount current = new CurrentAccount("C456", 3000, 2000);

        savings.deposit(1000);
        savings.checkMinimumBalance();

        current.useOverdraft(4000);
    }
}
