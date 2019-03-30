/**
 * Represents a Monster like Dracula, The Wolfman, The Mummy, etc.
 * 
 * @author DCoulombe
 */

public class Monster implements Comparable
{
    private String name;
    private int scaryFactor;  // 1 = least scary, 10 = most scary
    private String weakness;  // Examples: silver bullets, daylight, fire, water

    /**
     * Constructor for objects of class Monster
     */
    public Monster(String nameIn, int scaryIn, String weakIn)
    {
        name = nameIn;
        scaryFactor = scaryIn;   
        weakness = weakIn;
    }
    
    /**
     * Compare two Monsters. Scary Monsters are "greater than" less-scary Monsters
     */
    public int compareTo (Object other)
    {
        return this.scaryFactor - ((Monster) other).scaryFactor;
    }

    /**
     * Print a sentence summarizing the Monster's characteristics
     */
    public String toString()
    {
        return name + " is " + ((scaryFactor < 6 ? "not very " : "") + 
                "scary, and can be defeated by using " + weakness + ".");
    }
    
    public String getName()
    {
        return name;
    }
}
