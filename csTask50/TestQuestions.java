
/**
 * Abstract class TestQuestions - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
import java.util.Scanner;
public abstract class TestQuestions
{
    protected String question;
    
    public TestQuestions()
    {
    }
    
    public abstract void readQuestion(Scanner fileScan);
    
}
