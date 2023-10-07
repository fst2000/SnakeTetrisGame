public class Int
{
    static int loop(int value, int min, int max)
    {
        int length = max - min;
        if(length < 0) System.out.println("length is negative!");
        return (value % length) + (value < 0 ? max : min);
    }
}
