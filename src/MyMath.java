public class MyMath {

    public static int findSmallest(int x, int y, int z)
    {
        int smallest = x;

        if (y < smallest)
        {
            smallest = y;
        }

        if (z < smallest)
        {
            smallest = z;
        }

        return smallest;
    }

    public static double myPow(double a, double b)
    {
        double pow = a;

        if(b == 0)
        {
            pow = 1;
        }
        else
        {
            for(int i = 1; i < b; i++)
            {
                pow *= a;
            }
        }

        return pow;
    }

    public static int sum(int n)
    {
        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }

        return sum;
    }

    public static double factorial(int n)
    {
        double factorial = 1;

        for(int i = n; i > 0; i--)
        {
            factorial *= i;
        }

        return factorial;
    }

    public static boolean isPrime(int n)
    {
        boolean isPrime = true;

        for(int i = 2; i < n; i ++)
        {
            if((n % i) == 0)
            {
                isPrime = false;
            }
        }

        return isPrime;
    }

}
