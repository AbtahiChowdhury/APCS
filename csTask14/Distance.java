
/**
 * Computes the distance between two points.
 * 
 * @author Abtahi Chowdhury 
 * @version 10/19/15
 */

import java.util.Scanner;

public class Distance
{
    public static void main (String[] args)
    {
        double x1, y1, x2, y2; // coordinates of two points
        double distance; // distance between the points
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        System.out.print ("Enter the coordinates of the first point " +
            "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.print ("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        // Compute the distance
        double x, y, xpow, ypow;
        x = x2 - x1;
        y = y2 - y1;
        xpow = Math.pow(x, 2);
        ypow = Math.pow(y, 2);
        distance = Math.sqrt(xpow + ypow);
        // Print out the answer
        System.out.println ("Distance: " + distance);
    }
}