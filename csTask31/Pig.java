public class Pig
{
    private int goal;
    private PairOfDice dice;
    private PigPlayer human1, human2, currentPlayer;
    public Pig (int target)
    {
        goal = target;
        dice = new PairOfDice();
        human1 = new PigPlayer (PigPlayer.ASK);
        human2 = new PigPlayer (PigPlayer.ASK);
    }
    public void play ()
    {
        boolean noWinnerYet = true;
        currentPlayer = human1;
        while (noWinnerYet)
        {
            takeTurn();
            if (currentPlayer.getPoints() >= goal)
            {
                noWinnerYet = false;
            }
            else if (currentPlayer == human1)
            {
                currentPlayer = human2;
            }
            else
            {
                currentPlayer = human1;
            }
        }
        announceWinner();
    }
    private void takeTurn ()
    {
        boolean stillRolling = true;
        System.out.println ();
        System.out.println ("Current Status:");
        System.out.println ();
        System.out.println ("Player 1: " + human1.getPoints());
        System.out.println ("Player 2: " + human2.getPoints());
        while (stillRolling)
        {
            stillRolling = currentPlayer.roll (dice, goal);
        }
    }
    private void announceWinner ()
    {
        System.out.println();
        if (currentPlayer == human1)
        {
            System.out.println ("Player 1 has won!");
        }
        else
        {
            System.out.println ("Player 2 has won!");
        }
        System.out.println();
        System.out.println ("Final Results:");
        System.out.println ("Player 1: " + human1.getPoints());
        System.out.println ("Player 2: " + human2.getPoints());
    }
}