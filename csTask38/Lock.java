public class Lock 
{
    private boolean nutural = true; 
    private boolean flag1, flag2, flag3;
    private int one, two, three;
    private boolean unlock = true; 
    private int position = 0; 
    public Lock (int onein, int twoin, int threein)
    {
        one = onein;
        two = twoin;
        three = threein;
    }
    public void turnRight (int ticks)
    {
        if (nutural)
        {
            position = (40 - ticks);
            flag1 = false;
            nutural = false;
            if (position == one)
            {
                flag1 = true;
                System.out.println("position:" + position);
            }
        }
        else
        {
            if (position - ticks > 0 )
            {
                position = position - ticks; 
                System.out.println("position:" + position);
                flag3 = false; 
                if (position == three)
                {
                    flag3 = true; 
                }
            }
            else 
            {
                position = (40 - (ticks - position));
                flag3 = false;
                System.out.println("position:" + position);
                if (position == three )
                {
                    flag3 = true;
                }
            }
        }
    }
    public void turnLeft (int ticks)
    {
        if (position + ticks < 40 )
        {
            position = (position + ticks);
            System.out.println("position:" + position);
            flag2 = false;
            if (position == two )
            {
                flag2 = true;
            }
        }
        else
        {
            position = ( (position + ticks) - 40 );
            System.out.println("position:" + position);
            flag2 = false;  
            if (position == two) 
            {
                flag2 = true; 
            }
        }
    }
    public void reset ()
    {
        nutural = true; 
        flag1 = false;
        flag2 = false;
        flag3 = false; 
    }
    public void open ()
    {
        if (!(flag1 && flag2 && flag3))
        {
            unlock = false;
            System.out.println("Wrong combination!!"); 
        }
        else
        {
            System.out.println("Lock is open!!");
        }
    }
}