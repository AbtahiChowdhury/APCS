
/**
 * This program take the sides of a triangle and finds its area.
 * 
 * @author Abtahi Chowdhury
 * @version 10/17/15
 */

import java.util.Scanner;
import java.lang.Math;

public class PP2_10
{
    public static void main (String[] args)
    {
        int a, b, c, s, d, e, f;
        double area;
        Scanner scanln = new Scanner (System.in);
        System.out.println ("Give me the first side of a triangle.");
        a = scanln.nextInt();
        System.out.println ("Give me the second side of a triangle.");
        b = scanln.nextInt();
        System.out.println ("Give me the third side of a triangle.");
        c = scanln.nextInt();
        s = a + b + c;
        d = s - a;
        e = s - b;
        f = s - c;
        area = Math.sqrt(s * d * e * f);
        System.out.println ("The area is " + area);
    }
}
