public class SA_3_17
{
    enum Month
        {
            January, February, March, April, May, June, July,
            August, September, October, November, December
        }
    public static void main (String[] args)
    {
        for (Month m : Month.values())
        {
            System.out.println (m);
        }
    }
}
