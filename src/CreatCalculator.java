public class CreatCalculator {

    public static void main(String[] args) {
        int no1=20,no2=10,res;
        String sym = "+";
        switch (sym) {
            case "+":
                res = no1 + no2;
                System.out.println(res);
            case "-":
                res = no1 - no2;
                System.out.println(res);
            case "*":
                res = no1 * no2;
                System.out.println(res);
            case "/":
                res = no1 / no2;
                System.out.println(res);
                break;
            default:
                System.out.println("invalid symbol");
                break;
        }
    }
}
