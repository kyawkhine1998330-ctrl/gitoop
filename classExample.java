package OOP;

public class classExample {
    String Name;
    int Age;
    String Adress;

    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name=name;
    }
    
    class Student{
        String Name;
        int Age;

        public Student(String name,int age){
            this.Name=name;
            this.Age=age;
        }
        public void Introduce(){
            System.out.print("Hello"+Name+","+Age);
        }
    }
}
