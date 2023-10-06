public class Snake
{
    private int length;
    private Int2 snakeDirection;
    public Snake(int length, Int2 snakeDirection)
    {
        this.length = length;
    }
    public Int2 getSnakeDirection()
    {
        return snakeDirection;
    }
    public int getLength()
    {
        return length;
    }
    public void eat()
    {
        length++;
    }
}
