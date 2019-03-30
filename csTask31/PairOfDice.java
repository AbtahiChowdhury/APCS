public class PairOfDice
{
    private Die die1, die2;
    private int value1, value2, total;

    //-----------------------------------------------------------------
    //  Creates two six-sided Die objects, both with an initial
    //  face value of one.
    //-----------------------------------------------------------------
    public PairOfDice ()
    {
        die1 = new Die();
        die2 = new Die();
        value1 = 1;
        value2 = 1;
        total = value1 + value2;
    }

    //-----------------------------------------------------------------
    //  Rolls both dice and returns the combined result.
    //-----------------------------------------------------------------
    public int roll ()
    {
        value1 = die1.roll();
        value2 = die2.roll();
        total = value1 + value2;
        return total;
    }

    //-----------------------------------------------------------------
    //  Returns the current combined dice total.
    //-----------------------------------------------------------------
    public int getTotal ()
    {
        return total;
    }

    //-----------------------------------------------------------------
    //  Returns the current value of the first die.
    //-----------------------------------------------------------------
    public int getDie1 ()
    {
        return value1;
    }

    //-----------------------------------------------------------------
    //  Returns the current value of the second die.
    //-----------------------------------------------------------------
    public int getDie2 ()
    {
        return value2;
    }
}