import java.util.Arrays;

public class SquaresSortedArray {


    private static int[] sortedSquares(int[] array) {
        int n = array.length;
        int[] result = new int[n];

        int i = 0;
        int j = n - 1;

        for (int k = n - 1; k >= 0; k--) {

            if (Math.abs(array[i]) > Math.abs(array[j])) {
                result[k] = array[i] * array[i];
                i++;
            } else {
                result[k] = array[j] * array[j];
                j--;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {-4, -3, 0, 3, 10};

        int[] ints = sortedSquares(array);

        Arrays.stream(ints).boxed().map(x -> x + " ").forEach(System.out::print);
    }
}
