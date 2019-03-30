public class GradeRange
{
    public static void main (String[] args)
    {	
        String[] grade = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
        int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};
        final int NUM_GRADES = 12;
        Grade[] grades = new Grade[NUM_GRADES];
        for (int i=0; i<NUM_GRADES; i++)
        {
            grades[i] = new Grade (grade[i], cutoff[i]);
        }
        for (int level = 0; level < NUM_GRADES; level++)
        {
            System.out.println (grades[level].getGrade() + "\t" + grades[level].getCutoff());
        }
    }
}
