import java.util.*;
public class Slots
{
    public static void main(String[] args)
    {
        int num1, num2, num3, count1=0, count2=0, count3=0;
        boolean go = true;
        Random gen = new Random();
        Scanner scan = new Scanner(System.in);
        do
        {
            num1 = gen.nextInt(10);
            num2 = gen.nextInt(10);
            num3 = gen.nextInt(10);
            System.out.println("Your numbers are: "+num1+", "+num2+", "+num3);
            if(num1==num2)
            {
                if(num1==num3)
                {
                    count1++;
                }
                else
                {
                    count2++;
                }
            }
            else if(num1==num3)
            {
                count2++;
            }
            else if(num2==num3)
            {
                count2++;
            }
            else
            {
                count3++;
            }
            System.out.println("Spin again? y/n");
            String x = scan.nextLine();
            if(x.equalsIgnoreCase("n"))
            {
                go = false;
            }
        }
        while(go);
        
        System.out.println("Frequency of 3 repeats: "+count1);
        System.out.println("Frequency of 2 repeats: "+count2);
        System.out.println("Frequency of 0 repeats: "+count3);
    }
}
