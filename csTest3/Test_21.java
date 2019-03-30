
/**
 * Asks the user for a set of numbers and finds their total and average as they are entered.
 * 
 * @author Abtahi Chowdhury 
 * @version 11/22/15
 */

import java.util.Scanner;

public class Test_21
{
    public static void main (String [] args)
    {
        System.out.println ("Give me a series of positive integers. Give me a -1 if you want me to stop."); //Prompts for a set of numbers
        Scanner scan = new Scanner(System.in);
        int num=0, total=0;//declares num and total
        double count=0, average=0;// declares count and average
        while (num > -1)
        {
            num = scan.nextInt();//initializes num to next number
            if (num == -1)//test to see if series is over
            {
                System.out.println ("count: "+count);
                System.out.println ("total: "+total);
                System.out.println ("average: "+average);
            }
            else
            {
                count++;//increases count by 1
                total = total + num;//increases total by the new number
                average = total/count;//calculates the average of all the numbers so far
                System.out.println ("count: "+count);
                System.out.println ("total: "+total);
                System.out.println ("average: "+average);
            }
        }
    }
}
