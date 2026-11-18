package se.lexicon.ex_3_bankingSystem;

import se.lexicon.exceptions.InsufficientBalanceException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Cannot withdraw " + amount + ": insufficient balance (current balance: " + balance + ")");
        }
        balance -= amount;
    }
}
