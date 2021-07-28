public class StringImmutable {

    public static void main(String[] args) {
        String str = "hello";
        str.toUpperCase();   // immutable no change
        System.out.println(str);

        String str2 = str.toUpperCase();
        System.out.println(str2);
    }
}
