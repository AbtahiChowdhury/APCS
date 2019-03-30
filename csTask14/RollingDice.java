
/**
 * Rolls two dice and gives the results and their sum.
 * 
 * @author Abtahi Chowdhury 
 * @version 10/19/15
 */

import java.util.Random;

public class RollingDice
{
    public static void main (String [] args)
    {
        int dice1, dice2, total;
        Random roll = new Random();
        dice1 = roll.nextInt(6) + 1; 
        dice2 = roll.nextInt(6) + 1;
        total = dice1 + dice2;
        System.out.println ("First dice: " + dice1);
        System.out.println ("Second dice: " + dice2);
        System.out.println ("Total: " + total);
    }
}
