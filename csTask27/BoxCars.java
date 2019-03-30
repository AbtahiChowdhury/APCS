
/**
 * @author Abtahi Chowdhury
 * @version 11/30/15
 */

public class BoxCars
{
    public static void main (String[] args)
    {
        final int ROLLS = 1000, SUM = 12;
        int total, count = 0;
        PairOfDice dice = new PairOfDice();
        for (int roll=1; roll <= ROLLS; roll++)
        {
            total = dice.roll();
            if (total == SUM)
                count++;
        }
        System.out.println ("Number of rolls: " + ROLLS);
        System.out.println ("Number of Box Cars: " + count);
    }
}

