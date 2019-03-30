
/**
 * This program will generate 2 random numbers, add them and then find its square root.
 * 
 * @author Abtahi Chowdhury
 * @version 10/17/15
 */

import java.util.Scanner;
import java.lang.Math;

public class PP2_13
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