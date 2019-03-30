
/**
 * @author Abtahi Chowdhury
 * @version 11/12/2015
 */
// **********************************************************
// Temps.java
//
// This program reads in a sequence of hourly temperature
// readings (beginning with midnight) and prints the maximum
// temperature (along with the hour, on a 24-hour clock, it
// occurred) and the minimum temperature (along with the hour
// it occurred).
// **********************************************************
import java.util.Scanner;
public class Temps
{
    //----------------------------------------------------
    // Reads in a sequence of temperatures and finds the
    // maximum and minimum read in.
    //----------------------------------------------------
    public static void main (String[] args)
    {
        final int HOURS_PER_DAY = 24;
        int max = -999999;
        int min = 999999;
        int HourOfMaxTemp = 0;
        int HourOfMinTemp = 0;
        int temp; // a temperature reading
        Scanner scan = new Scanner(System.in);
        // print program heading
        System.out.println ();
        System.out.println ("Temperature Readings for 24 Hour Period");
        System.out.println ();
        for (int hour = 0; hour < HOURS_PER_DAY; hour++)
        {
            System.out.print ("Enter the temperature reading at " + hour + " hours: ");
            temp = scan.nextInt();
            if (temp > max)
            {
                max = temp;
                HourOfMaxTemp = hour;
            }
            if (temp < min)
            {
                min = temp;
                HourOfMinTemp = hour;
            }
        }
        // Print the results
        System.out.println ("The maximun temperature is " + max + " and it was " + max + " after " + HourOfMaxTemp + " hours from the start.");
        System.out.println ("The minimun temperature is " + min + " and it was " + min + " after " + HourOfMinTemp + " hours from the start.");
    }
}