/**
 * WriteTest reads in test questions and prints out a formatted test.
 * 
 * @author  
 * @version 
 */

import java.util.Scanner;
import java.io.*;

public class WriteTest
{
    public static void main(String[] args) throws IOException
    {
        Scanner fileScan = new Scanner (new File("test2.txt"));
        int i=0;
        
        // Read in the number of test questions
        int numQuestions = Integer.parseInt(fileScan.nextLine());
               
        // Instantiate the array of TestQuestions of the proper length
        TestQuestions[] mytest = new TestQuestions[numQuestions];

        
        // Repeat until finished: Read in the type of test question, create a
        //  new TestQuestion of that type, read the rest of the information for
        //  that question into the TestQuestion array.
        while(fileScan.hasNext())
        {
            String type=fileScan.nextLine();
            if(type.equals("e"))
            {
                int numoflines = Integer.parseInt(fileScan.nextLine());
                String questione = fileScan.nextLine();
                mytest[i] = new Essay(numoflines, questione);
            }
            if(type.equals("m"))
            {
                int numofchoices = Integer.parseInt(fileScan.nextLine());
                String questionm = fileScan.nextLine();
                String[] choices = new String[numofchoices];
                for(int j=0;i<numofchoices;i++)
                {
                    choices[i]=fileScan.nextLine();
                }
                mytest[i] = new MultChoice(choices, questionm);
            }
            
            i++;
        }
        
        // Repeat until finished: Print out each TestQuestion, nicely formatted
        for(TestQuestions q : mytest)
        {
            q.toString();
            System.out.println("");
        }
        
    }
}
