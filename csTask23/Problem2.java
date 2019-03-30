
/**
 *  A program that determines and prints the number of odd, even, and zero 
 *  digits in an integer value read from the keyboard.
 *  
 * @author Abtahi Chowdhury 
 * @version 11/16/2015
 */
import java.util.Scanner;
public class Problem2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int value;
        int evenCount = 0, oddCount = 0, zeroCount = 0;
        System.out.print("Enter an integer: ");
        value = scan.nextInt();
        while (value > 0) 
        {

            if ((value%10)==0) 
            {
                zeroCount++;
            }
            else if (value%2==0) 
            {
                evenCount++;
            }
            else 
            { 
                oddCount++;
            }
            value /= 10;
        }
        System.out.println ("Even: "+evenCount);
        System.out.println ("Odd: "+oddCount);
        System.out.println ("Zeros: "+zeroCount);
    }
}
