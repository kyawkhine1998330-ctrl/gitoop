package level1Exam;

class BankAccount1 {
    String accountHolder;
    String accountNumber;
    private double balance;

    public BankAccount1(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (balance < 0) {
            this.balance = 0;
        }else{
            this.balance = balance;
        }
    }

    public boolean deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }else{
            return false;
        }
    }
    public boolean withdraw(double amount) {
        if (balance > 0 && balance > amount) {
            this.balance -= amount;
            return true;
        }else{
            return  false;
        }
    
    }

    public boolean transferTo(BankAccount1 target, double amount) {
        if (amount < this.balance) {
            target.balance += amount;
            this.balance -= amount;
            return true;
        }else{
            return false;
        }
         
    }

    public double getBalance() {
        return this.balance;
    }
    public void displayInfo() {
        System.out.print("Calling to empty method");
    }

    public void displayInfo(String info){
        System.out.print("Calling to String method");
    }

    public void displayInfo(String info1,String info2){
        System.out.print("Calling to 2 String method "+info1+","+info2);
    }

    public void displayInfo(String info1,double info2){
        System.out.print("Calling to 2 String method "+info1+","+info2);
    }

    public void displayInfo(double info1,String info2){
        System.out.print("Calling to 2 String method "+info1+","+info2);
    }

    public void displayInfo(double d1){
        System.out.print("Calling to double method");
    }
}

public class QEleven {
    public static void main(String[] args) {
        BankAccount1 acc1 = new BankAccount1("Mg Mg", "A001",1000.0);
        BankAccount1 acc2 = new BankAccount1("Ag Ag", "A002", 100);
        acc1.displayInfo("Hello","World");
        // acc1.transferTo(acc2, 500); // acc1 500 acc2 600
        // acc2.transferTo(acc1, 1000);//acc1 500 acc2  600

        // System.out.println(acc1.getBalance());
        // System.out.println(acc2.getBalance());
    }
}
