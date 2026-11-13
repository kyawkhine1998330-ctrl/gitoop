package level2;

class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerNmae, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerNmae;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        }
        return balance;
    }

    
}
public class exe1 {
        public static void main(String[] rgs) {
            BankAccount account = new BankAccount("A001", "John", 1000);
            account.deposit(500);
            account.withdraw(-500);
            System.out.println(account.getBalance());
        }
    }