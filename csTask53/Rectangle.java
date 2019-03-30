
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    private double length, width;
    
    public Rectangle(double l, double w)
    {
        super("Rectangle");
        length = l;
        width = w;
    }
    
    public double area()
    {
        return (length*width);
    }
    
    public String toString()
    {
        return super.toString() + " of length " + length + " and of width " + width;
    }
}
