
/**
 * Finds the factorial of any given number.
 * 
 * @author Abtahi Chowdhury
 * @version 11/3/15
 */

import java.util.Scanner;

public class Factorials
{
    public static void main (String[] args)
    {
        int num;
        int count;
        int factorial = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println ("Give me a number and I will find it's factorial.");
        num = scan.nextInt();
        while (num < 0)
        {
            System.out.println ("Please enter a positive number.");
            num = scan.nextInt();
        }
        if (num == 0)
        {
            System.out.println ("0! = 1");
        }
        else
        {
            System.out.println (num + "! is:");
            count = num - 1;
            while (count >= 1)
            {
                factorial = (num) * (count);
                num = factorial;
                count--;
            }
        }
        System.out.println (factorial);
    }
}
