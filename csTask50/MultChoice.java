
/**
 * Write a description of class MultipleChoice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MultChoice extends TestQuestions
{
    protected String[] choices;
    protected String question;
    
    public MultChoice(String[] choicesin, String questionin)
    {
        super();
        choices=choicesin;
        question=questionin;
    }
    
    public void setNumOfChoices(int choicesin)
    {
        choices = new String[choicesin];
    }
    
    public void readQuestion(Scanner fileScan)
    {
        question = fileScan.nextLine();
    }
    
    public void readChoices(Scanner fileScan)
    {
        for(int i=0;i<choices.length;i++)
        {
            choices[i]=fileScan.nextLine();
        }
    }
    
    public String toString()
    {
        String z=question;
        for(int i=0;i<choices.length;i++)
        {
            z.concat("/n"+choices[i]);
        }
        return z;
    }
}
