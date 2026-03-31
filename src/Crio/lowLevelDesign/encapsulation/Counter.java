package Crio.lowLevelDesign.encapsulation;

public class Counter {
    private int count;

    public Counter(int count)
    {
        if(count < 0)
        {
            throw new IllegalArgumentException("Enter valid initial count.");
        }
        else
        {
            this.count = count;
        }
    }

    public void increment()
    {
        count += 1;
    }

    public void decrement()
    {
        count -= 1;
    }

    public int getValue()
    {
        return count;
    }

    public void reset()
    {
        count = 0;
    }
}
