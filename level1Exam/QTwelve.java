package level1Exam;

class ElectricityBill {
    String customerName;
    String customerId;
    double unitsConsumed;

    public ElectricityBill(String customerName, String customerID, double unitsConsumed) {
        this.customerName = customerName;
        this.customerId = customerID;
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill() {
        if (unitsConsumed <= 100) {
            return unitsConsumed * 10;
        }
        if (unitsConsumed <= 200) {
            return (100 * 10) + (unitsConsumed-100) * 15;
        }else{
            return (100 * 10) + (100*15) + (unitsConsumed-200) * 20;
        }
    }
    public double calculateTax() {
        return (10.0/100)*calculateBill();
    }
    public double calculateTotalAmount() {
        return calculateBill() + this.calculateTax();
    }
    public void displayInfo() {
        System.out.println("CustomerName :" + this.customerName);
        System.out.println("CustomerID :" + this.customerId);
        System.out.println("Unit :" + this.unitsConsumed);
        System.out.println("Bill :" + this.calculateBill());
        System.out.println("Tax :" + this.calculateTax());
        System.out.println("Total :" + this.calculateTotalAmount());
        System.out.println();
    }
}

public class QTwelve {
    public  static  void main(String[] args) {
        ElectricityBill B1 = new ElectricityBill("KK", "A01", 250);
        B1.displayInfo();

        int day = 3;
        switch (day) {
            case 1:
            System.out.println();
                break;
            case 2:
            System.out.println();
                break;
            case 3:
            System.out.println();
                break;
            default:
            System.out.println();
                break;
        }
    }
}
