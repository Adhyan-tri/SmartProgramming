import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter name");
        String name = s.next();
        System.out.println("Enter your age");
        int age = s.nextInt();
        System.out.println("Enter your gender");
        char gender = s.next().charAt(0);
        System.out.println("Enter your phone number");
        long phoneno = s.nextLong();

        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("Phone number:" + phoneno);
    }
}
