package level2;
 class Calculator {
    public int add (int a,int b) {
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b) {
        return (a+b);
    }
    public double add(int a,int b,double c) {
        return (a+b+c);
    }
}
public class exe3 {
    public static void main (String[] args) {
        Calculator calc = new Calculator();
        calc.add(10,20);
        calc.add(10,20,30);
        calc.add(10.5,20.5);
        calc.add(10,20,30.5);
    }
}
