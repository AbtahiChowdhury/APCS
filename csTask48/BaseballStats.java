public class BaseballStats extends PlayerStats
{
    protected int hits, errors;
    
    public BaseballStats (String player, String team)
    {
        super (player, team);
        hits = 0;
        errors = 0;
    }

    public void score()
    {
        score += 1;
    }

    public void getHit()
    {
        hits += 1;
    }

    public void commitError()
    {
        errors += 1;
    }

    public int getHits()
    {
        return hits;
    }

    public int getErrors()
    {
        return errors;
    }

    public String toString()
    {
        String result = super.toString();
        result += "\nHits: " + hits;
        result += "\nErrors: " + errors;
        return result;
    }
}
