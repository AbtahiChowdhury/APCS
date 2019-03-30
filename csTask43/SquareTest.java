/** 
 * SquareTest uses the Square class to read in square data and tell if
 * each square is magic.
 */
import java.util.Scanner;
import java.io.*;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("magicData.txt"));
        int count = 1; //count which square we're on
        int size = scan.nextInt(); //size of next square
        //Expecting -1 at bottom of input file
        while (size != -1)
        {
            //create a new Square of the given size
            Square square = new Square(size);
            //call its read method to read the values of the square
            square.readSquare(scan);
            System.out.println("\n******** Square " + count + " ********");
            //print the square
            square.printSquare();
            //print the sums of its rows
            for(int i = 0; i < size; i++)
            {
                System.out.println("Sum of row "+i+": "+square.sumRow(i));
            }
            //print the sums of its columns
            for(int i = 0; i < size; i++)
            {
                System.out.println("Sum of column "+i+": "+square.sumCol(i));
            }
            //print the sum of the main diagonal
            System.out.println("Sum of the main diagonal: "+square.sumMainDiag());
            //print the sum of the other diagonal
            System.out.println("Sum of the other diagonal: "+square.sumOtherDiag());
            //determine and print whether it is a magic square
            if(square.magic())
            {
                System.out.println("It is a magic square.");
            }
            else
            {
                System.out.println("It isn't a magic square.");
            }
            //get size of next square
            size = scan.nextInt();
        }
    }
}
