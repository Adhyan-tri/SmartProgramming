import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter sub 1 Hindi");
        String sub1hindi = s.next();
        System.out.println("Enter sub 2 English");
        String sub2english = s.next();
        System.out.println("Enter sub 3 Math");
        String sub3math = s.next();
        System.out.println("Enter sub 4 Science");
        String sub4science = s.next();
        System.out.println("Enter sub 5 SST");
        String sub5sst = s.next();


        System.out.println("Hindi:" + sub1hindi);
        System.out.println("Enlish:" + sub2english);
        System.out.println("Math:" + sub3math);
        System.out.println("Science:" + sub4science);
        System.out.println("SST:" + sub5sst);
    }
}
