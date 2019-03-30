
/**
 * Write a description of class Name here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Name
{
    private String first;
    private String middle;
    private String last;
    public Name(String firstin, String middlein, String lastin)
    {
        first = firstin;
        middle = middlein;
        last = lastin;
    }
    public String getFirst()
    {
        return first;
    }
    public String getMiddle()
    {
        return middle;
    }
    public String getLast()
    {
        return last;
    }
    public String firstMiddleLast()
    {
        return (first + " " + middle + " " + last);
    }
    public String lastFirstMiddle()
    {
        return (last + ", " + first + " " + middle);
    }
    public boolean equals(Name otherName)
    {
        String name = this.firstMiddleLast();
        if(name.equalsIgnoreCase(otherName.firstMiddleLast()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String initials()
    {
        String i1 = first.substring(0);
        String i2 = middle.substring(0);
        String i3 = last.substring(0);
        String initial = (i1.concat(i2).concat(i3));
        initial = initial.toUpperCase();
        return initial;
    }
    public int length()
    {
        int total = (first.length() + middle.length() + last.length());
        return total;
    }
}
