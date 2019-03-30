public class SortedIntList extends IntList
{
    public SortedIntList(int size)
    {
        super(size);
    }
    
    public void add(int value)
    {
        int x=value;
        if(numElements==list.length)
            System.out.println("Can't add, list is full");
        else
        {
            list[numElements]=value;
            numElements++;
            for (int i=0;i<numElements;i++)
            {
                for (int u=i+1;u<numElements;u++)
                {
                    if(list[i]>list[u])
                    {
                        list[u]=list[i];
                        list[i]=x;
                    }
                }
            }
        }
    }
}
