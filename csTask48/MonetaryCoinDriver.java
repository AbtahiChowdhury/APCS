public class MonetaryCoinDriver
{
    public static void main (String[] args)
    {
        MonetaryCoin[] coins = new MonetaryCoin[7];
        coins[0] = new MonetaryCoin(1);
        coins[1] = new MonetaryCoin(5);
        coins[2] = new MonetaryCoin(10);
        coins[3] = new MonetaryCoin(25);
        coins[4] = new MonetaryCoin(50);
        coins[5] = new MonetaryCoin(100);
        coins[6] = new MonetaryCoin(100);
        for (int flipping = 0; flipping < coins.length; flipping++)
        {
            coins[flipping].flip();
        }
        int sum = 0;
        for (int adding = 0; adding < coins.length; adding++)
        {
            sum += coins[adding].getValue();
        }
        for (int index = 0; index < coins.length; index++)
        {
            System.out.println (coins[index]);
        }
        System.out.println ("\nTotal Value: " + sum);
    }
}