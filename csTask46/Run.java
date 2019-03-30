public class Run
{
    public static void main(String[] args)
    {
        Die die = new Die();
        int[] array = new int[20];
        boolean inRun = false;
        for(int i=0;i<20;i++)
        {
            array[i] = die.roll();
        }
        System.out.println("The sequence of numbers is:");
        for(int i=0;i<20;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for(int i=0;i<19;i++)
        {
            System.out.print(array[i] + " ");
            if(inRun==true && array[i]!=array[i-1])
            {
                System.out.print(")");
                inRun = false;
            }
            if(inRun==false && array[i]==array[i+1])
            {
                System.out.print("(");
                inRun = true;
            }
        }
        if(inRun==true)
        {
            System.out.println(")");
        }
    }
}
