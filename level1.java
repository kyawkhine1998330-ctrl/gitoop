

import java.util.Scanner;
public class level1 {
    public static void main(String[] args){
    System.out.println("--------Welcome--------");
    System.out.println();
    System.out.println("[1] Add New Student");
    System.out.println("[2] Add New Student with mark");
    System.out.println("");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an option->");

    //step2
    int option = sc.nextInt();

   
    // step3
    if(option==1){
        
    }

    sc.close();

    }


}

class Student {
    String name;
    int age;
}

