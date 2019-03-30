import java.util.Scanner;
public class Grader
{
    public static void main(String[] args)
    {
        System.out.println("How many questions are in the quiz?");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] key = new int[x];
        int correct = 0;
        String v;
        boolean c=true;
        System.out.println("Enter the values of the answer key.");
        for (int i=0; i<key.length; i++)
        {
            key[i] = scan.nextInt();
        }
        while(c)
        {
            System.out.println("Enter the answers.");
            int m;
            for (int i=0; i<key.length; i++)
            {
                m=scan.nextInt();
                if(m==key[i])
                {
                    correct++;
                }
            }
            System.out.println("Number correct: " + correct);
            System.out.println("Percent correct: " + ((correct*100.0)/x));
            System.out.println("Grade another quiz? (y/n)");
            v = scan.nextLine();
            if(v.equalsIgnoreCase("n"))
            {
                c=false;
            }
        }
    }
}
