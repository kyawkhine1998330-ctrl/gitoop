package level1Exam;

class BankAccont{
    private double balance;

   BankAccont(double balance ){
        this.balance=balance;
    }
    public void deposit(double amount){
       if (amount <= 0 ) {      
       }else {
        this.balance=this.balance+amount;
       }
    }
    public double getBalance(){
        return balance;
    }
}

public class QSeven {
    public  static void main(String[] args){
        BankAccont account=new BankAccont(1000);
        account.deposit(-100);
        System.out.println("Balance:"+account.getBalance());
    }
}
