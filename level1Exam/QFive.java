package level1Exam;

class Employee{
    String name;
    String employeeId;
    double salary;

       public Employee(String name,String employeeId,double salary){
        this.name=name;
        this.employeeId=employeeId;
        this.salary=salary;
    }
        public void displayDetails(){
            System.out.println("Employee:"+this.name);
            System.out.println("ID:"+this.employeeId);
            System.out.println("Salary:"+this.salary);
            System.out.println();
        }
    }
public class QFive {
    public static void main(String[]args){
        Employee E1=new Employee("Mg Mg", "E001", 3000.0);
        Employee E2=new Employee("Hla Hla", "E002", 4000.0);
        E1.displayDetails();
        E2.displayDetails();
        
    }
}
