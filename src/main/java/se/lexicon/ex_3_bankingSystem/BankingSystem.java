package se.lexicon.ex_3_bankingSystem;

import se.lexicon.exceptions.InsufficientBalanceException;


public class BankingSystem {

    void main() {
        BankAccount account = new BankAccount(100);

        account.deposit(50);
        IO.println("Balance after deposit: " + account.getBalance());

        try {
            account.withdraw(30);
            IO.println("Balance after withdrawal: " + account.getBalance());

            account.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            IO.println("Withdrawal failed: " + e.getMessage());
        }

        IO.println("Final balance: " + account.getBalance());
    }
}
