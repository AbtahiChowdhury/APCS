import java.util.Random;
public class Deck
{
    private int numCards;
    private Card[] cards;
    private int NUM_CARDS = 52;
    public Deck()
    {
        numCards = NUM_CARDS;
        cards = new Card[numCards];
        int cardIndex = 0;
        for (int face = Card.ACE; face <= Card.KING; face++)
        {
            for (int suit = Card.CLUBS; suit <= Card.SPADES; suit++)
            {
                cards[cardIndex++] = new Card(face, suit);
            }
        }
    }

    public Card deal()
    {
        if (numCards > 0)
            return cards[--numCards];
        else
            return null;
    }

    public int getNumCardsInDeck()
    {
        return numCards;
    }

    public boolean hasMoreCards()
    {
        return (numCards > 0);
    }

    public void shuffle()
    {
        Random gen = new Random();
        numCards = NUM_CARDS;
        boolean[] taken= new boolean[NUM_CARDS];
        for (int i=0; i<numCards; i++)
        {
            taken[i] = false;
        }
        int[] shufflePositions = new int[NUM_CARDS];
        int count = 0;
        while (count < 52)
        {
            int place = gen.nextInt(NUM_CARDS);
            if (!taken[place])
            {
                shufflePositions[count] = place;
                taken[place] = true;
                count++;
            }
        }
        Card[] temp = new Card[NUM_CARDS];
        for (int i=0; i< numCards; i++)
        {
            temp[shufflePositions[i]] = cards[i];
        }
        cards = temp;
    }
}
