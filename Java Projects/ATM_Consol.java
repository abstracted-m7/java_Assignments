import java.util.ArrayList;
import java.util.Scanner;

class Transaction {
    private String type;
    private double amount;
    private String date;

    public Transaction(String type, double amount, String date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}

class Account {
    private String userId;
    private String pin;
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public Account(String userId, String pin, double initialBalance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public boolean validatePin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        recordTransaction("Deposit", amount);
        System.out.println("Deposit successful. Current balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            recordTransaction("Withdrawal", amount);
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        }
    }

    public void transfer(Account recipient, double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Transfer failed.");
        } else {
            balance -= amount;
            recipient.deposit(amount);
            recordTransaction("Transfer to " + recipient.getUserId(), amount);
            System.out.println("Transfer successful. Current balance: $" + balance);
        }
    }

    public void displayTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transaction history available.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction transaction : transactionHistory) {
                System.out.println(
                        transaction.getType() + " of $" + transaction.getAmount() + " on " + transaction.getDate());
            }
        }
    }

    private void recordTransaction(String type, double amount) {
        String date = java.time.LocalDate.now().toString();
        Transaction transaction = new Transaction(type, amount, date);
        transactionHistory.add(transaction);
    }
}

class ATMSystem {
    private Account currentAccount;
    private Scanner scanner;

    public ATMSystem() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        // Authenticate user
        Account userAccount = authenticateUser(userId, pin);

        if (userAccount != null) {
            this.currentAccount = userAccount;
            displayMainMenu();
        } else {
            System.out.println("Invalid User ID or PIN. Exiting...");
        }
    }

    private Account authenticateUser(String userId, String pin) {
        // In a real-world scenario, you would validate credentials against a database.
        // For simplicity, we are using hardcoded values here.
        if ("12345".equals(userId) && "1234".equals(pin)) {
            return new Account(userId, pin, 1000.0); // Sample initial balance
        }
        return null;
    }

    private void displayMainMenu() {
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    currentAccount.displayTransactionHistory();
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    currentAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter recipient's User ID: ");
                    String recipientId = scanner.nextLine();
                    System.out.print("Enter transfer amount: $");
                    double transferAmount = scanner.nextDouble();

                    // In a real-world scenario, you would fetch the recipient's account from a database.
                    // For simplicity, we create a new account here.
                    Account recipientAccount = new Account(recipientId, "", 0.0);
                    currentAccount.transfer(recipientAccount, transferAmount);
                    break;
                case 5:
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}

public class ATM_Consol {
    public static void main(String[] args) {
        ATMSystem atmSystem = new ATMSystem();
        atmSystem.start();
    }
}
