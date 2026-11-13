package level2;

class Bank_Account{
    private String accno;
    private String owner_name;
    private double Balance;

    public Bank_Account (String accno,String owner_name,double Balance) {
        this.accno = accno;
        this.owner_name = owner_name;
        if (Balance >= 0) {
            this.Balance = Balance;
        }else{
            this.Balance = 0;
        }
    }
    public  String get_accno () {
        return accno;
    }
    public  String getowner_name () {
        return owner_name;
    }
    public double get_Balance (){
        return Balance;
    }
    public double Deposit (double amount) {
        if (amount > 0) {
            Balance += amount;
        }
        return Balance;
    }
    public double withdrawing (double amount) {
        if (amount <= Balance && amount >0) {
            Balance -= amount;
        }
        return Balance;
    }
}

public class renshu1 {
    public static void main(String[] args) {
        Bank_Account acc = new Bank_Account("A2468", "April", 10000);
        acc.Deposit(2000);
        acc.withdrawing(5000);
        System.out.println(acc.get_Balance());
    }
}
