
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String holderName;
    private double balance;

    public Account(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            displayBalance();
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String holderName, double initialBalance) {
        Account account = new Account(accountNumber, holderName, initialBalance);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully.");
    }

    public void performTransaction(String accountNumber, int choice, double amount) {
        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        switch (choice) {
            case 1:
                account.deposit(amount);
                break;
            case 2:
                account.withdraw(amount);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public void displayAccountDetails(String accountNumber) {
        Account account = accounts.get(accountNumber);

        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.println("Account Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Holder Name: " + account.getHolderName());
        account.displayBalance();
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Perform Transaction");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String holderName = scanner.nextLine();
                    System.out.print("Enter Initial Balance: $");
                    double initialBalance = scanner.nextDouble();

                    bank.createAccount(accountNumber, holderName, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String accNumber = scanner.nextLine();
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.print("Enter your choice: ");
                    int transactionChoice = scanner.nextInt();
                    System.out.print("Enter Amount: $");
                    double transactionAmount = scanner.nextDouble();

                    bank.performTransaction(accNumber, transactionChoice, transactionAmount);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String accountNum = scanner.nextLine();
                    bank.displayAccountDetails(accountNum);
                    break;

                case 4:
                    System.out.println("Exiting the Bank App. Thank you!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
