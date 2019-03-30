/**
 * Represents a Dinosaur
 * 
 * @author DCoulombe
 */

public class Dinosaur implements Comparable
{
    private String name;
    private int ferocity;  // 1 = least ferocious, 10 = most ferocious
    private String diet;  // Examples: plants, smaller creatures, other dinosaurs

    /**
     * Constructor for objects of class Dinosaur
     */
    public Dinosaur(String nameIn, int ferocityIn, String dietIn)
    {
        name = nameIn;
        ferocity = ferocityIn;   
        diet = dietIn;
    }
    
    /**
     * Compare two Dinosaurs. Ferocious dinosaurs are "greater than"
     * less-ferocious Dinosaurs
     */
    public int compareTo (Object other)
    {
        return this.ferocity - ((Dinosaur) other).ferocity;
    }

    /**
     * Return name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Print a sentence summarizing the Dinosaur's characteristics
     */
    public String toString()
    {
        return name + " is " + ((ferocity < 6 ? "not very " : "") + 
                "ferocious, and likes to eat " + diet + ".");
    }
}
