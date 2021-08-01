public class ReverseNumber {


    private static int reverseNumber(int x) {

        int remainder = 0;
        int reversedNumber = 0;

        while (x != 0) {

            remainder = x % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            x = x / 10;

        }

        return reversedNumber;

    }


    public static void main(String[] args) {

        System.out.println(reverseNumber(123));
    }
}
