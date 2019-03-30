public class Task implements Priority
{
    private int priority;
    String name;
    public Task(String taskName)
    {
        name = taskName;
        priority = MED_PRIORITY;
    }
    String getName()
    {
        return name;
    }
    public void setPriority(int value)
    {
        priority = value;
    }
    public int getPriority()
    {
        return priority;
    }
}