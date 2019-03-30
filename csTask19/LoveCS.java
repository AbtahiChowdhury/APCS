//****************************************************************
// LoveCS.java
//
// Use a while loop to print many messages declaring your
// passion for computer science
// ****************************************************************

import java.util.Scanner;

public class LoveCS
{
    public static void main(String[] args)
    {
        final int LIMIT = 10;
        int count = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println ("How many times do you want to display the message?");
        int NUM = scan.nextInt();
        while (count <= NUM)
        {
            System.out.println(count + " I love Computer Science!!");
            count++; // a convenient abbreviation for: count = count + 1;
        }
        count = NUM;
        System.out.println ("Printed the message " + count + " times.");
        int sum = ((count*(1+count))/2);
        System.out.println ("Printed the message " + count + " times. The sum of 1 to " + count + " is: " + sum);
    }
}
