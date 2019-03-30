
/**
 * This program will generate 2 random numbers, add them and then find its square root.
 * 
 * @author Abtahi Chowdhury 
 * @date 10/14/15
 */

import java.util.Scanner;
import java.lang.Math;

public class SA2_10
{
    public static void main (String [] args)
    {
        int num1, num2;
        double sqrt;
        Scanner scanIn = new Scanner(System.in);
        System.out.println ("Give me 2 numbers.");
        num1 = scanIn.nextInt();
        num2 = scanIn.nextInt();
        sqrt = (Math.sqrt(num1 + num2));
        System.out.println (sqrt);
    }
}
