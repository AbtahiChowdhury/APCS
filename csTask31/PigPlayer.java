import java.util.Scanner;
public class PigPlayer
{
    public final static int ASK = -1;
    private boolean rollAgain;
    private int total;
    private int roundpoints;
    private int threshold;
    private static PairOfDice dice = new PairOfDice();
    public PigPlayer (int max)
    {
        total = 0;
        roundpoints = 0;
        threshold = max;
    }
    public boolean roll (PairOfDice dice, int goal)
    {
        rollAgain = true;
        Scanner scan = new Scanner (System.in);
        dice.roll();
        int die1 = dice.getDie1();
        int die2 = dice.getDie2();
        System.out.println ();
        System.out.println ("Dice: " + die1 + " + " + die2 + " = " + (die1+die2));
        if (die1 == 1 || die2 == 1)
        {
            System.out.println ("Bust");
            rollAgain = false;
            roundpoints = 0;
            if (die1 == 1 && die2 == 1)
            {
                total = 0;
            }
        }
        else
        {
            roundpoints += die1 + die2;
            System.out.println ("Current Round: " + roundpoints);
            System.out.println ("Potential Total: " + (total+roundpoints));
            if ((total+roundpoints) >= goal)
            {
                rollAgain = false;
            }
            else if (threshold == ASK)
            {
                System.out.print ("Take another turn (y/n)? ");
                String again = scan.nextLine();
                rollAgain = again.equalsIgnoreCase("y");
            }
            else if (roundpoints >= threshold)
            {
                rollAgain = false;
            }
            if (! rollAgain)
            {
                total += roundpoints;
                roundpoints = 0;
            }
        }
        return rollAgain;
    }
    public int getPoints()
    {
        return total;
    }
}