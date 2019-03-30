
/**
 * Write a description of class Leap_Year here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Leap_Year
{ 
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Give me a year greater than 1582.");
        int year = scan.nextInt();
        if (year >= 1582)
        {
           if (year % 4 == 0)
           System.out.println ("That is a leap year.");
           else
           System.out.println ("That is not a leap year.");
        }
        else
        {
           System.out.println ("ERROR!!!!");
        }
    }
}

