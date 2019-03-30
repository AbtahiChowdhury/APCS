/**
 * A utility class that provide methods to compute elements of the
 * Fibonacci sequence.
 */
public class Fib
{
    /**
     * Recursively computes fib(n)
     */
    public static int fib1(int n)
    {
        //Fill in code -- this should look very much like the
        //mathematical specification
        System.out.println("fib1("+n+")");
        if (n<2) 
        {
            return n;
        }
        else 
        {
            return fib1(n-1)+fib1(n-2);
        }
    }

    public static int fib2(int n)
    {
        System.out.println("fib2("+n+")");
        int[] array = new int[n];
        array[0]=0;
        array[1]=1;
        for(int i=2;i<array.length;i++) 
        {
            array[i]=(array[i-1]+array[i-2]);
        }
        return array.length;
    }
}
