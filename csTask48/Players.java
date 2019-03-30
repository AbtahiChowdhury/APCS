public class Players
{
    public static void main (String [] args)
    {
        BaseballStats player1;
        FootballStats player2;

        player1 = new BaseballStats ("Lynn Dempsey", "Jovanovic");
        player2 = new FootballStats ("Gulbrand Rothenberg", "Zahradnik");

        player1.score();
        player2.score();
        player1.getHit();
        player2.gainYards(15);

        System.out.println (player1);
        System.out.println ();
        System.out.println (player2);
    }
}
