package level1Exam;

class Student {
    String name;
    String stdentId;
    double mathScore;
    double englishScore;
    double scienceScore;


    public Student(String name,String studendId) {
        this.name = name;
        this.stdentId = studendId;
        this.mathScore = 0;
        this.englishScore = 0;
        this.scienceScore = 0;
    }
    public double calculateAverage() {
        return (mathScore + englishScore + scienceScore) / 3;
    }

    public String getGrade() {
        double avg = this.calculateAverage();
        if (avg >= 80) {
            return "A";
        }else if (avg >= 60 && avg <= 79.99) {
            return "B";
        }else if (avg >= 40 && avg <= 59.99) {
            return "C";
        }else{
            return "F";
        }

    }
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Student ID: " + this.stdentId);
        System.out.println("Average :" + this.calculateAverage());
        System.out.println("Grade :" + this.getGrade());
    }
}

public class QTen {
    public static void main(String[] args) {
        Student S1 = new Student("Aung Aung", "S001");   
         Student S2 = new Student("Aung Aung 2", "S002");
        Student S3 = new Student("Aung Aung 3", "S002");
         Student S4 = new Student("Aung Aung 4", "S002");
         Student S5 = new Student("Aung Aung 5", "S002");
         Student S6 = new Student("Aung Aung 6", "S002");
         Student S7 = new Student("Aung Aung 7", "S002");

        S1.displayInfo();
    }
}
