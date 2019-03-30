import java.util.Scanner;
public class Play
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("How many points are needed to win?");
      int x = scan.nextInt();
      Pig game = new Pig (x);
      game.play();
   }
}