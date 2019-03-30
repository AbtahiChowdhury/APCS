public interface Priority
{
    static final int MED_PRIORITY = 5;
    static final int MAX_PRIORITY = 10;
    static final int MIN_PRIORITY = 1;
    public void setPriority(int value);
    public int getPriority();
}
