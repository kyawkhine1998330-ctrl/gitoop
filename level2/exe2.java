package level2;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void displayInfo() {
        System.out.println("Name " + this.name);
        System.out.println("Salary " + this.salary);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("ProgrammingLangage"+this.programmingLanguage);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("TeamSize"+this.teamSize);
    }
}

public class exe2 {
    public static void main(String[] args) {
        Developer dev = new Developer("John", 5000, "Java");
        Manager manager = new Manager("Mike", 8000, 5);

        dev.displayInfo();
        manager.displayInfo();
    }
}
