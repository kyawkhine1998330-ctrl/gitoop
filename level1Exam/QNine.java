package level1Exam;

class Product{
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void displayInfo() {
        System.out.println("Prodct:"+this.name);
        System.out.println("Price:"+this.price);
        System.out.println("Qantity:"+this.quantity);
    } 
    public double calculateTotalValue() {
        return price * quantity;
    }
        
    public void restock(int amount){
        if (amount <= 0) {
        }else{
            quantity += amount;
        }

    }
}

public class QNine {
    public static void main (String[] args){
        Product P1 = new Product("Keyboard", 50.0, 5);
        Product P2 = new Product("Mouse", 25.0, 8);
        P1.displayInfo();
        System.out.println("Total Value:" + P1.calculateTotalValue());
        System.out.println();
        P2.displayInfo();
        System.out.println("Total Value:" + P2.calculateTotalValue());
        System.out.println();
        P1.restock(10);
        System.out.println("Quantity:"+P1.quantity);
        System.out.println("Total Value:" + P1.calculateTotalValue());
    }
}
