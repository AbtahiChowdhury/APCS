/**
 * Defines a Player class that holds information about an athlete.
 * 
 * @author LLC
 * @version 02/25/2015
 */
import java.util.Scanner;
public class Player
{
    private String name;
    private String team;
    private int jerseyNumber;
    
    /**
     * Prompts for and reads in the player's name, team, and
     * jersey number.
     */
    public void readPlayer()
    {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Name: ");
        name = scanIn.nextLine();
        System.out.print("Team: ");
        team = scanIn.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = scanIn.nextInt();
    }
    
    public boolean equals(Player player1)
    {
        if(this.team.equals(player1.team))
        {
            if(this.jerseyNumber == player1.jerseyNumber)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
