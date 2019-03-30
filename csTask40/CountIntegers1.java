import java.util.Scanner;
public class CountIntegers1
{
    public static void main (String [] args)
    {
        int [] entres = new int [51];
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter integers between 0-50.");
        System.out.println ("When finished, enter an a number outside the range.");
        int entered = scan.nextInt ();
        while (entered >= 0 && entered <= 50)
        {
            entres [entered] ++;
            entered = scan.nextInt ();
        }
        System.out.println ("Number\tTimes");
        for (int check = 0; check <= 50; check++)
        {
            if (entres [check] >= 1)
            {
                System.out.println (check + "\t" + entres [check]);
            }
        }
    }
}