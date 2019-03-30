public abstract class PlayerStats
{
    protected String player, team;
    protected int score;
    public PlayerStats (String playerName, String teamName)
    {
        player = playerName;
        team = teamName;
        score = 0;
    }

    public int getScore()
    {
        return score;
    }

    public abstract void score();

    public String toString()
    {
        String result = "Player: " + player;
        result += "\nTeam: " + team;
        result += "\nScore: " + score;
        return result;
    }
}