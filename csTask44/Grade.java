public class Grade
{
    private String grade;
    private int cutoff;
    public Grade(String gradein, int cutoffin)
    {
        grade = gradein;
        cutoff = cutoffin;
    }
    String getGrade()
    {
        return grade;
    }
    int getCutoff()
    {
        return cutoff;
    }
}