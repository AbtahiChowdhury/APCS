
/**
 * Write a description of class Comparisons2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Comparisons2
{
    public static void main (String[] args)
    {
        String Str1, Str2, Str3;
        int again;
        do
        {
            Str1 = JOptionPane.showInputDialog ("Enter a String: ");
            Str2 = JOptionPane.showInputDialog ("Enter another String: ");
            Str3 = JOptionPane.showInputDialog ("Enter a third String: ");
            JOptionPane.showMessageDialog (null, (Compare3.largest(Str1, Str2, Str3)));
            again = JOptionPane.showConfirmDialog (null, "Do Another?");
        }
        while (again == JOptionPane.YES_OPTION);
    }
    //Autoboxing takes the int entered and reads it as a string.
}
