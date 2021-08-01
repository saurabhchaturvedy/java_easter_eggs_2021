public class ValidSubsequence {



    private static boolean isValidSubsequence(String str,String subSeq)
    {
        int i=0;
        int j=0;

        while (i<str.length() && j<subSeq.length())
        {

            if(str.charAt(i)==subSeq.charAt(j))
            {
                j++;
            }

            i++;
        }

        return j==subSeq.length();
    }


    public static void main(String[] args) {

        System.out.println(isValidSubsequence("ramesh","rms"));
    }
}
