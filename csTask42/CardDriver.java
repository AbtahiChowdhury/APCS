public class CardDriver
{
    public static void main (String args[])
    {
        Deck deck = new Deck();
        deck.shuffle();
        int cardNumber = 0;
        System.out.println("Dealing shuffled cards:");
        while (deck.hasMoreCards())
        {
            System.out.println("   " + ++cardNumber + ": " + deck.deal());
        }
    }
}