
/**
 * Write a description of class Essay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Essay extends TestQuestions
{
    protected int lines;
    protected String question;
    
    public Essay(int linein, String questionsin)
    {
        super();
        lines=linein;
        question=questionsin;
    }
    
    public void setNumOfLines(int linesin)
    {
        lines=linesin;
    }
    
    public void readQuestion(Scanner fileScan)
    {
        question = fileScan.nextLine();
    }
    
    public String toString()
    {
        String z=question;
        for(int i=0;i<lines;i++)
        {
            z.concat("/n");
        }
        return z;
    }
}
