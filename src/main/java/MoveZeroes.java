import java.util.Arrays;

public class MoveZeroes {



    private static void moveZeroes(int[]array)
    {

        int n = array.length;

        int temp=0;

        int j=0;

        for(int i=0; i<n; i++)
        {
            if(array[i]!=0 && array[j]==0)
            {

                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

            if(array[j]!=0)
            {
                j++;
            }

        }
    }


    public static void main(String[] args) {

        int[]arr = {2,3,0,5,6,0,8,9,0,11};

        moveZeroes(arr);

        Arrays.stream(arr).boxed().map(x->x+" ").forEach(System.out::print);
    }
}
