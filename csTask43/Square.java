/**
 * Define a Square class with methods to create and read in
 * info for a square matrix and to compute the sum of a row,
 * a col, either diagonal, and whether it is magic.
 */
import java.util.Scanner;
public class Square
{
    int[][] square;
    Scanner scan = new Scanner(System.in);
    private int sumrow, sumcol, summaindiag, sumotherdiag;
    /** Create new square of given size */
    public Square(int sizein)
    {
        square = new int[sizein][sizein];
    }

    /** Return the sum of the values in the given row */
    public int sumRow(int row)
    {
        for(int i=0; i < square.length; i++)
        {
            sumrow += square[row][i];
        }
        return sumrow;
    }

    /** Return the sum of the values in the given column */
    public int sumCol(int col)
    {
        for(int i=0; i < square.length; i++)
        {
            sumcol += square[i][col];
        }
        return sumcol;
    }

    /** Return the sum of the values in the main diagonal */
    public int sumMainDiag()
    {
        for(int i=0; i < square.length; i++)
        {
            summaindiag += square[i][i];
        }
        return summaindiag;
    }

    /** Return the sum of the values in the other diagonal */
    public int sumOtherDiag()
    {
        for(int i=square.length - 1; i <= 0; i--)
        {
            sumotherdiag += square[i][i];
        }
        return sumotherdiag;
    }

    /** Return true if the square is magic (all rows, cols, and diags have
     *  same sum), false otherwise */
    public boolean magic()
    {
        int sum=0;
        int lastSum=0;
        boolean magic=true;
        for (int i=0; i< square.length; i++)
        {
            if (square.length!=square[i].length)
            {
                magic = false;
            }
        }
        for (int i=0; i < square[0].length; i++)
        {
            sum=0;
            for (int j=0; j < square.length; j++)
            {
                sum+=square[i][j];
            }
            System.out.print(sum+" ");
            if (i==0)
            {
                lastSum=sum;
            } 
            else if (lastSum!=sum)
            {
                magic = false;
            }
        }
        System.out.println();
        return magic;
    }

    /** Read info into the square from the input stream associated with the
     *  Scanner parameter */
    public void readSquare(Scanner scan)
    {
        for (int row = 0; row < square.length; row++)
        {
            for (int col = 0; col < square.length; col ++)
            {
                square[row][col] = scan.nextInt();
            }
        }
    }

    /** Print the contents of the square, neatly formatted */
    public void printSquare()
    {
        for (int row = 0; row < square.length; row++)
        {
            for (int col = 0; col < square.length; col ++)
            {
                System.out.print(square[row][col]+ "\t");
            }
        }
        System.out.println();
    }
}
