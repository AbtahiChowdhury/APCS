
/**
 * Reads baseball data in from a comma delimited file. Each line
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * 
 * @author (LLC) 
 * @version (10/20/2014)
 */

import java.util.Scanner;
import java.io.*;

public class BaseballStats
{
    /**
     * Reads baseball stats from a file and counts
     * total hits, outs, walks, and sacrifice flies
     * for each player.
     */
    public static void main (String[] args) throws IOException
    {
        Scanner fileScan, lineScan;
        String fileName;
        String record;
        Scanner scan = new Scanner(System.in);

        System.out.print ("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));

        // Read and process each line of the file
        while (fileScan.hasNext())
        {
            record = fileScan.nextLine();
            System.out.println ("Record: " + record);
            lineScan = new Scanner (record);
            lineScan.useDelimiter(",");
            int h=0, o=0, w=0, s=0;
            String name = lineScan.next();
            System.out.println("Name = " + name);
            while (lineScan.hasNext())
            {
                String token = lineScan.next();
                if (token.equals("h"))
                {
                    h++;
                }
                if (token.equals("o"))
                {
                    o++;
                }
                if (token.equals("w"))
                {
                    w++;
                }
                if (token.equals("s"))
                {
                    s++;
                }
            }
            System.out.println("Hits = " + h);
            System.out.println("Outs = " + o);
            System.out.println("Walks = " + w);
            System.out.println("sacrifice fly = " + s);
            System.out.println();
        }
    }
}