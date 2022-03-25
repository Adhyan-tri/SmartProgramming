public class ReverseString {
    public static void main(String[] args) {

//        String name = "Adhyan";
//        int leng = name.length();
//        String rev = " ";
//
//        for (int i = leng - 1; i >= 0; i--) {
//            rev = rev + name.charAt(i);
//        }
//        System.out.println(rev);


        String name = "ABCD";
        int leng = name.length();
        String rev = " ";

        for (int i = leng - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Resversed String is:" + rev);
    }
}
