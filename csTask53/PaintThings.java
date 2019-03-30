/**
 * PaintThings.java computes the amount of paint needed to paint various
 * things. Uses the amount method of the paint class which
 * takes any Shape as a parameter.
 * 
 * @author Lewis/Loftus modified by DJC
 * @version 3/16/2016 
 */
import java.text.DecimalFormat;
public class PaintThings
{
    /**
     * Creates some shapes and a Paint object and prints
     * the amount of paint needed to paint each shape.
     */
    public static void main (String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        double deckAmt, ballAmt, tankAmt;
        // Instantiate the three shapes to paint
        deck = new Rectangle(20, 30);
        bigBall = new Sphere(15);
        tank = new Cylinder(10, 30);
        // Compute the amount of paint needed for each shape
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
        // Print the amount of paint for each.
        System.out.println("The deck needs " + deckAmt + " gallons of paint.");
        System.out.println("The big ball needs " + ballAmt + " gallons of paint.");
        System.out.println("The tank needs " + tankAmt + " gallons of paint.");
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck " + fmt.format(deckAmt));
        System.out.println ("Big Ball " + fmt.format(ballAmt));
        System.out.println ("Tank " + fmt.format(tankAmt));
    }
}