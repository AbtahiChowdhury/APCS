
/**
 * @author Abtahi Chowdhury
 * @version 11/30/15
 */

public class PairOfDice
{
    private Die die1, die2;
    private int value1, value2, total;
    public PairOfDice ()
    {
        die1 = new Die();
        die2 = new Die();
        value1 = 1;
        value2 = 1;
        total = value1 + value2;
    }
    public int roll ()
    {
        value1 = die1.roll();
        value2 = die2.roll();
        total = value1 + value2;
        return total;
    }
    public int getTotal ()
    {
        return total;
    }
    public int getDie1 ()
    {
        return value1;
    }
    public int getDie2 ()
    {
        return value2;
    }
}