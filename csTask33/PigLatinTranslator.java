import java.util.StringTokenizer;
public class PigLatinTranslator
{	
    public static String translate (String sentence)
    {
        String result = "";
        sentence = sentence.toLowerCase();
        StringTokenizer tokenizer = new StringTokenizer (sentence);
        while (tokenizer.hasMoreTokens())
        {
            result += translateWord (tokenizer.nextToken());
            result += " ";
        }
        return result;
    }
    private static String translateWord (String word)
    {
        String result = "";
        if (beginsWithVowel(word))
        {
            result = word + "yay";
        }
        else if (beginsWithPrefix(word))
        {
            result = word.substring(2) + word.substring(0,2) + "ay";
        }
        else
        {
            result = word.substring(1) + word.charAt(0) + "ay";
        }
        return result;
    }
    private static boolean beginsWithVowel (String word)
    {
        String vowels = "aeiouAEIOU";
        char letter = word.charAt(0);
        return (vowels.indexOf(letter) != -1);
    }
    private static boolean beginsWithPrefix (String str)
    {
        return ( str.startsWith ("bl") || str.startsWith ("pl") ||
            str.startsWith ("br") || str.startsWith ("pr") ||
            str.startsWith ("ch") || str.startsWith ("sh") ||
            str.startsWith ("cl") || str.startsWith ("sl") ||
            str.startsWith ("cr") || str.startsWith ("sp") ||
            str.startsWith ("dr") || str.startsWith ("sr") ||
            str.startsWith ("fl") || str.startsWith ("st") ||
            str.startsWith ("fr") || str.startsWith ("th") ||
            str.startsWith ("gl") || str.startsWith ("tr") ||
            str.startsWith ("gr") || str.startsWith ("wh") ||
            str.startsWith ("kl") || str.startsWith ("wr") ||
            str.startsWith ("ph") );
    }
}