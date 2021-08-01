public class FibonacciUptoN {



    //  0 1 1 2 3 5 8 13 21 34...

    private static void printFibonacciSeries(int n)
    {

        int first = 0;
        int second = 1;

        int next=0;

        System.out.print(first+" "+second);

        for(int i=3; i<=n; i++)
        {
            next = first + second;
            System.out.print(" "+next);
            first = second;
            second = next;
        }
    }


    public static void main(String[] args) {

        printFibonacciSeries(10);
    }
}
