public class MaximumSumSubArray {



    private static int maximumSumSubArray(int[]array)
    {

        int currentSum=array[0];
        int bestSum=array[0];

        for(int i=1; i<array.length; i++)
        {

            currentSum = currentSum + array[i];

            if(currentSum<array[i])
            {
                currentSum=array[i];
            }

            if(bestSum<currentSum)
            {
                bestSum=currentSum;
            }
        }

        return bestSum;


    }


    public static void main(String[] args) {

        int[]arr = {4,3,-2,6,-12,7,-1,6};

        System.out.println(maximumSumSubArray(arr));
    }
}
