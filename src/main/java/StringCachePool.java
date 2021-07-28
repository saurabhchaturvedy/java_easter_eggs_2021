public class StringCachePool {

    public static void main(String[] args) {
        String s1="Hello";  // true
        String s2="Hello";  // true  // String literal (intern)


        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);


        String s3 = new String("Hello");  // not interned

        System.out.println(s1.equals(s3));  // true
        System.out.println(s1==s3);  // false


        String s4 = new String("Hello").intern();  // searches for string in string pool before assigning a new reference
        System.out.println(s1.equals(s4));  // true
        System.out.println(s1==s4);  // true

    }
}
