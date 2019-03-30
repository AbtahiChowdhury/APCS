import java.util.Scanner;

public class CountIntegers2
{
    public static void main (String [] args)
    {
        int [] entries = new int [51];
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter integers in the range -25 to 25.");
        System.out.println ("When finished, enter an a number outside the range.");
        int entered = scan.nextInt ();
        while (entered >= -25 && entered <= 25)
        {
            entries [entered + 25] ++;
            entered = scan.nextInt ();
        }
        System.out.println ("Number\tTimes");
        for (int check = -25; check <= 25; check++)
        {
            if (entries [check+25] >= 1)
            {
                System.out.println (check + "\t" + entries [check+25]);
            }
        }
    }
}