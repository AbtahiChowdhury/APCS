
/**
 * Write a description of class BandBooster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BandBooster
{
    private String name;
    private int boxesSold;
    public BandBooster(String namein)
    {
        name = namein;
        boxesSold = 0;
    }
    public String getName()
    {
        return name;
    }
    public void updateSales(int boxesSoldin)
    {
        boxesSold = boxesSold + boxesSoldin;
    }
    public String toString()
    {
        return (name + ": " + boxesSold);
    }
}
