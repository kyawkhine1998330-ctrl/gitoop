package level1Exam;
class Car{
    String brand;
    int year;

    public Car() {

    }

    public void displayInfo(){
        System.out.println("Brand:"+this.brand);
        System.out.print("Year:"+this.year);
    }
}

public class QThree {
    public static void main(String[] args){
       Car Honda = new Car();
        Honda.brand="Toyota";
        Honda.year=2024;
        Honda.displayInfo();
    }   
}





