import java.util.Random;
import java.util.Scanner;

public class SA_3_14
{
    public static void main (String[] args)
    {
        Random Sen = new Random();
        Scanner scan = new Scanner(System.in);
        int SENTINEL = Sen.nextInt(10) + 1;
        System.out.print ("Enter an integer from 1 - 10 to quit: ");
        int num = scan.nextInt();
        while (num != SENTINEL)
        {
            System.out.println ("Wrong number. Enter a new one.");
            num = scan.nextInt();
        }
        System.out.println ("Correct. You may leave now.");
    }
}
