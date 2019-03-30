import java.util.Scanner;

public class SA_3_18
{
    public static void main (String [] args)
    {
        int max, number;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter an integer: ");
        max = scan.nextInt();
        for (int count = 2; count <= 10; count++)
        {
            System.out.print ("Enter another integer: ");
            number = scan.nextInt();
            if (number > max)
            {
                max = number;
            }
        }
        System.out.println ("The highest value is :" + max);

    }
}
