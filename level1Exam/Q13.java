package level1Exam;


public class Q13 {
    public static void main(String[] args) {
        System.out.println("Numbers:");
        int[] numbers = {10,20,30,40,50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        System.out.println("Reverse Order :");
        for (int i=numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }
}
