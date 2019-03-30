public class MonetaryCoin extends Coin
{
    private int value;
    public MonetaryCoin (int money)
    {
        super();
        value = money;
    }

    public void setValue (int money)
    {
        value = money;
    }

    public int getValue ()
    {
        return value;
    }

    public String toString()
    {
        String result = super.toString();
        result += "\t" + value;
        return result;
    }
}