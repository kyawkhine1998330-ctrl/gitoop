package OOP;

import java.util.Scanner;

public class caculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Name:");
    String name = sc.nextLine();
    System.out.println(name);

    System.out.print("Enter Age:");
    int age = sc.nextInt();
    System.out.println(age);

    System.out.print("Enter Mark:");
    int mark = sc.nextLine();
    System.out.println(sc.nextInt());
    sc.close();
    }

}
