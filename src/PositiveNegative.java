import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = s.nextInt();

        if (no > 0) {
            System.out.println("Number is positive");
        } else if (no < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
