import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = s.nextInt();

        if (no < 25) {
            System.out.println("F");
        } else if ((no >= 25) && (no < 45)) {
            System.out.println("E");
        } else if ((no >= 45) && (no < 50)) {
            System.out.println("D");
        } else if ((no >= 50) && (no < 60)) {
            System.out.println("C");
        } else if ((no >= 60) && (no < 80)) {
            System.out.println("B");
        } else if ((no >= 80) && (no <= 100)) {
            System.out.println("A");
        } else {
            System.out.println("Not a correct marks");
        }
    }
}
