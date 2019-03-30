
/**
 * This program finds how much money you have.
 * 
 * @author Abtahi Chowdhury
 * @version 10/17/15
 */

import java.util.Scanner;

public class PP2_12
{
    public static void main (String [] args)
    {
        int q, d, n, p;
        double e, f, g, h, total;
        Scanner scanln = new Scanner (System.in);
        System.out.println ("Give me the number of quarters.");
        q = scanln.nextInt();
        System.out.println ("Give me the number of dimes.");
        d = scanln.nextInt();
        System.out.println ("Give me the number of nickels.");
        n = scanln.nextInt();
        System.out.println ("Give me the number of pennies.");
        p = scanln.nextInt();
        e = 0.25 * q;
        f = 0.1 * d;
        g = 0.05 * n;
        h = 0.01 * p;
        total = e + f + g + h;
        System.out.println ("You have " + total);
    }
}
