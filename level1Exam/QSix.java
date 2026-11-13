package level1Exam;

class Rectangle {
    double witdh;
    double height;
    public Rectangle(double witdh,double height) {
        this.witdh=witdh;
        this.height=height;
    }
    public double calculateArea(){
        return witdh*height;
    }
    public double calculatePerimiter(){
      return 2*(witdh+height);
    }
}


public class QSix {
     public static void main(String[]args){
        Rectangle R1= new Rectangle(10, 2);
        Rectangle R2= new Rectangle(10, 5);
        R1.calculateArea();
        R1.calculatePerimiter();
        R2.calculateArea();
        R2.calculatePerimiter();
        System.out.println("Area:"+R1.calculateArea());
        System.out.println("Perimeter:"+R1.calculatePerimiter());
        System.out.println("Area:"+R2.calculateArea());
        System.out.println("Perimeter:"+R2.calculateArea());

        
     }
}
