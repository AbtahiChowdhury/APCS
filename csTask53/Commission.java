
/**
 * Write a description of class Commission here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Commission extends Hourly
{
    private double totalsales;
    private double commissionrate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionratein)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionrate = commissionratein;
    }
    
    public void addSales (double totalSales)
    {
        totalsales += totalSales;
    }
    
    public double pay()
    {
        double x = super.pay();
        x += (commissionrate * totalsales);
        totalsales = 0;
        return x;
    }
    
    public String toString()
    {
        String y = super.toString();
        y += "\nTotal Sales: " + totalsales;
        return y;
    }
}
