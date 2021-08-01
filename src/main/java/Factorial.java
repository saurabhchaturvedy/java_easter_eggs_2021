public class Factorial {


    private static int factorial(int x)
    {

        int result=1;

        for(int i=1; i<=x; i++)
        {
            result*=i;
        }

        return result;
    }

    private static int factorialRecursive(int x)
    {

        if(x<=0) return 1;

        return x*factorialRecursive(x-1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

        System.out.println();

        System.out.println(factorialRecursive(5));
    }
}
