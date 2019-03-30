
/**
 * A program that reads a string from the user and prints it out one character per line.
 * 
 * @author Abtahi Chowdhury 
 * @version 11/16/2015
 */
import java.util.Scanner;
public class Problem1
{
    public static void main (String[] args)
    {
        System.out.println ("Type a sentence.");
        Scanner scan = new Scanner(System.in);
        String phrase = scan.nextLine();
        int length = phrase.length();
        for (int i = 0; i < length; i++)
        {
            char x = phrase.charAt(i);
            System.out.println (x);
        }
    }
}
