public class Palimdrome {
    public static void main(String[] args) {
//
//        int num = 3553, reversedNum = 0, remainder;
//
//        // store the number to originalNum
//        int originalNum = num;
//
//        // get the reverse of originalNum
//        // store it in variable
//        while (num != 0) {
//            remainder = num % 10;
//            reversedNum = reversedNum * 10 + remainder;
//            num /= 10;
//        }
//
//        // check if reversedNum and originalNum are equal
//        if (originalNum == reversedNum) {
//            System.out.println(originalNum + " is Palindrome.");
//        }
//        else {
//            System.out.println(originalNum + " is not Palindrome.");
//        }











        String name = "Radar", reverseStr = "";

        int strLength = name.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + name.charAt(i);
        }

        if (name.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(name + " is a Palindrome String.");
        }
        else {
            System.out.println(name + " is not a Palindrome String.");
        }



    }
}
