
/**
 * @author Abtahi Chowdhury
 * @version 11/30/15
 */

public class Die
{
    private final int MIN_FACES = 4;
    private int numFaces;
    private int faceValue;
    public Die ()
    {
        numFaces = 6;
        faceValue = 1;
    }
    public Die (int faces)
    {
        if (faces < MIN_FACES)
            numFaces = 6;
        else
            numFaces = faces;
        faceValue = 1;
    }
    public int roll ()
    {
        faceValue = (int) (Math.random() * numFaces) + 1;
        return faceValue;
    }
    public int getFaceValue ()
    {
        return faceValue;
    }
}