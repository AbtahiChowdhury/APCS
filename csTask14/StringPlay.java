
/**
 * This program changes a String variable with different methods.
 * 
 * @author Abtahi Chowdhury
 * @version 10/19/15
 */
// **************************************************
// StringPlay.java
//
// Play with String objects
// **************************************************
public class StringPlay
{
    public static void main (String[] args)
    {
        String college = new String ("PoDunk College");
        String town = new String (" Anytown, USA"); // part (a)
        int stringLength;
        String change1, change2, change3;
        stringLength = college.length(); // part (b)
        System.out.println (college + " contains " + stringLength + " characters.");
        change1 = college.toUpperCase(); // part (c)
        System.out.println ("The variable change1 is " + change1);
        change2 = change1.replace ('O', '*'); // part (d)
        System.out.println ("The variable change2 is " + change2);
        change3 = college.concat (town); // part (e)
        System.out.println ("The final string is " + change3);
    }
}
