import java.util.Arrays;

public class ShuffleArray {



    private static void shuffleArray(Object[]array)
    {

        int n = array.length;

        for(int i=0; i<n; i++)
        {
            int shuffleIndex = i + (int)(Math.random()*(n-i));

            Object temp = array[shuffleIndex];
            array[shuffleIndex] = array[i];
            array[i] = temp;
        }
    }


    public static void main(String[] args) {

        String[]str = new String[]{"A","B","C","D","E"};

        shuffleArray(str);

        Arrays.stream(str).map(x->x+" ").forEach(System.out::print);

    }
}
