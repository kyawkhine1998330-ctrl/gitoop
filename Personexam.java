package OOP;

class PersonA {
    String name;
    int age;

    public PersonA() {
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am "+age +" years old");
    }
}

class Student extends PersonA {
    int studentID;

    public Student() {
        super();
    }

    public void study() {
        System.out.println("Student is studying");
    }
}

class Teacher extends PersonA {
    String subject;

    public Teacher() {
        super();
    }

    public void teach() {
        System.out.println("Teacher is teaching " + subject);
    }
}

public class Personexam {
    public static void main(String[] args) {
        PersonA Alice = new PersonA();
        Alice.name="Alice";
        Alice.age=30;
        Alice.introduce();
        Student A = new Student();
        A.study();
        
        
        Alice.name="Bob";
        Alice.age=40;
        Alice.introduce();
        Teacher T = new Teacher();
        T.subject="Math";
        T.teach();

        
        Alice.name="KYAW KHINE";
        Alice.age=27;
        Alice.introduce();
       
      
    }
}