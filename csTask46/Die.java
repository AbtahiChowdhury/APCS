public class Die
{
    private int numFaces;
    private int faceValue;
    public Die()
    {
        numFaces = 6;
        faceValue = 1;
    }

    public int roll()
    {
        faceValue = (int) (Math.random() * numFaces) + 1;
        return faceValue;
    }

    public int getFaceValue()
    {
        return faceValue;
    }
}