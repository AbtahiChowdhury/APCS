import java.util.Scanner;
public class ReverseArray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many values do you want?");
        int x = scan.nextInt();
        int[] values = new int[x];
        System.out.println("Enter the values for each number in the array.");
        for (int i=0; i<values.length; i++)
        {
            values[i] = scan.nextInt();
        }
        for (int i=0; i<values.length; i++)
        {
            System.out.println("Value "+i+" is "+values[i]);
        }
        for(int i = 0; i < values.length / 2; i++)
        {
            int temp = values[i];
            values[i] = values[values.length - i - 1];
            values[values.length - i - 1] = temp;
        }
        System.out.println("The array has been reversed.");
        for (int i=0; i<values.length; i++)
        {
            System.out.println("Value "+i+" is "+values[i]);
        }
    }
}
