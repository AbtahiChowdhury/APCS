public class SA_3_19
{
    public static void main (String[] args)
    {
        String name = "The will to win, the desire to succeed, the urge to reach your full potential... these are the keys that will unlock the door to personal excellence.";
        int count = 0;
        for (int position = 0; position < name.length(); position++)
        {
            if (name.charAt(position) == 'a')
            {
                count++;
            }
        }
        System.out.println ("The character \'a\' appears " + count + " time(s)");
    }
}
