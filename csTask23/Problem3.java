
/**
 * Write a description of class Problem3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Problem3
{
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int letA = 0, letE = 0, letI = 0, letO = 0, letU = 0;
        int cons = 0, spc = 0, punc = 0; 
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        for ( int i=0; i < input.length(); i++ )
        {
            char ch = input.charAt(i);
            if ( 'a' == ch )
            {
                letA++;
            }
            if ( 'e' == ch ) 
            {
                letE++;
            }
            if ( 'i' == ch ) 
            {
                letI++;
            }
            if ( 'o' == ch )
            {
                letO++;
            }
            if ( 'u' == ch )
            {
                letU++;
            }
            ch = Character.toLowerCase(ch);
            if ('a' != ch && 'e' != ch && 'i' != ch && 'o' != ch && 'u' != ch && '.' != ch && ',' != ch && '-' != ch && '!' != ch && '?' != ch && '_' != ch && ' ' != ch)
            {
                cons++;
            }
            if ( '.' == ch || ',' == ch || '-' == ch || '!' == ch || '?' == ch || '_' == ch)
            {
                punc++;
            }
            if ( ' ' == ch)
            {
                spc++;
            }
        }
        System.out.println("There are " + input.length() + " characters total.\n" +
            "Vowels:\n" +
            "A's : " + letA + "\n" +
            "E's : " + letE + "\n" +
            "I's : " + letI + "\n" +
            "O's : " + letO + "\n" +
            "U's : " + letU);
        System.out.println("There are " + cons + " consonants.");
        System.out.println("There are " + punc + " punctuation marks.");
        System.out.println("There are " + spc + " spaces");
    }
}