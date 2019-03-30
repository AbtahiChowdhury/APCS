
/**
 * Asks the user for 2 strings and tests if they are overlapping.
 * 
 * @author Abtahi Chowdhury 
 * @version 11/22/15
 */

import java.util.Scanner;

public class Test_22
{
    public static void main (String[] args)
    {
        System.out.println ("Give me a sentence.");//prompts for first sentence
        Scanner scan = new Scanner(System.in);
        boolean repeat=true;//declare a boolean and initilize it to true
        boolean overlap=false;
        String s1 = scan.nextLine();//declare a string and initilize it
        System.out.println ("Give me a second sentence.");//prompts for second sentence
        String s2 = scan.nextLine();//declare a string and initilize it
        int length1 = s1.length();//declares and int and sets it to the lenght of the string
        int length2 = s2.length();//declares and int and sets it to the lenght of the string

        while (repeat)
        {
            for (int i=0; i<length1; i++)
            {
                for (int j=0; j<length2; j++)
                {
                    if (s1.charAt(i) != s2.charAt(j))
                    {
                        overlap=false;
                    }
                    else
                    {
                        overlap=true;
                    }
                }
            }
            if (overlap=true)
            {
                System.out.println ("They do overlap.");
            }
            if (overlap=false)
            {
                System.out.println ("They don't overlap.");
            }
            repeat=false;
        }
    }
}