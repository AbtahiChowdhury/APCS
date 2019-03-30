
/**
 * Write a description of class TestNames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TestNames
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tell me the first, middle, and last name of a person");
        String z = scan.nextLine();
        String x = scan.nextLine();
        String c = scan.nextLine();
        Name name1 = new Name(z, x, c);
        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length());
        
        System.out.println("Tell me the first, middle, and last name of another person");
        String v = scan.nextLine();
        String b = scan.nextLine();
        String n = scan.nextLine();
        Name name2 = new Name(v, b, n);
        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length());
        
        if(name1.equals(name2))
        {
            System.out.println("These names are the same.");
        }
        else
        {
            System.out.println("These names aren't the same.");
        }
    }
}
