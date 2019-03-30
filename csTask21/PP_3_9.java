import java.util.Scanner;

public class PP_3_9
{
    public static void main (String[] args)
    {
        final int MAX = 100;
        int numVerses = 0;
        Scanner scan = new Scanner(System.in);
        while (numVerses < 1 || numVerses > MAX)
        {
            System.out.print ("How many verses (1 to " + MAX + ")? ");
            numVerses = scan.nextInt();
        }
        int count = MAX;
        for (int verse = 1; verse <= numVerses; verse++)
        {
            System.out.println (count + " bottles of beer on the wall.");
            System.out.println (count + " bottles of beer.");
            System.out.println ("If one of those bottles should happen to fall");
            count = count - 1;
            System.out.println (count + " bottles of beer on the wall.");
            System.out.println ();
        }
    }
}

