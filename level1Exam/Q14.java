package level1Exam;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        String[] name = {"Aung Aung","Su Su","Mg Mg","Hla Hla","Kyaw Kyaw"};
        int[] scores = {90,65,45,30,80};
        String[] grades = new String[5];

        for (int i=0;i < scores.length; i++) {
            if (scores[i]>= 80) {
                grades[i] ="A";
            }else if(scores[i]>=60 && scores[i]<80) {
                grades[i] = "B";
            }else if(scores[i]>=40 && scores[i]<60) {
                grades[i] ="C";
            }else{
                grades[i] ="F";
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Student number (1-5) : ");
        int Snum = sc.nextInt();

        switch (Snum) {
            case 1:
                System.out.println("Student Name:"+name[0]);
                System.out.println("Scores :"+scores[0]);
                System.out.println("Grades :"+grades[0]);
                break;
            case 2:
                System.out.println("Student Name:"+name[1]);
                System.out.println("Scores :"+scores[1]);
                System.out.println("Grades :"+grades[1]);
                break;
            case 3:
                System.out.println("Student Name:"+name[2]);
                System.out.println("Scores :"+scores[2]);
                System.out.println("Grades :"+grades[2]);
                break;
            case 4:
                System.out.println("Student Name:"+name[3]);
                System.out.println("Scores :"+scores[3]);
                System.out.println("Grades :"+grades[3]);
                break;
            case 5:
                System.out.println("Student Name:"+name[4]);
                System.out.println("Scores :"+scores[4]);
                System.out.println("Grades :"+grades[4]);
                break;
            default:
                System.out.println("Invalid student number");
                break;
        }
        sc.close();
        
    }
}
