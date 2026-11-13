package level1Exam;

class Student1{
    String name;
    int age;

    public Student1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void introduce(){
        System.out.println("Name:"+this.name+","+"Age:"+this.age);
    }
}

public class QFour {
    public static void main(String[]args){
        Student1 S1= new Student1("Aung Aung",20);
        Student1 S2= new Student1 ("Su Su",22);
        S1.introduce();
        S2.introduce();
    }
}
