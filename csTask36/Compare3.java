
/**
 * Write a description of class Compare3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compare3
{
    public static Comparable largest(Comparable first, Comparable second, Comparable third)
    {
        if ((first.compareTo(second))>=1)
        {
            if ((first.compareTo(third))>=1)
            {
                return first;
            }
            else
            {
                return third;
            }
        }
        else if((second.compareTo(third))>=1)
        {
            return second;
        }
        else
        {
            return third;
        }
    }
}
