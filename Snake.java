public class Snake
{
    private int length;
    private Direction snakeDirection;
    private boolean isDead;
    Snake(int length, Direction snakeDirection)
    {
        this.length = length;
    }
    Direction getSnakeDirection()
    {
        return snakeDirection;
    }
    int getLength()
    {
        return length;
    }
    void eat()
    {
        length++;
    }
    void die()
    {
        isDead = true;
    }
    boolean isDead()
    {
        return isDead;
    }
}
