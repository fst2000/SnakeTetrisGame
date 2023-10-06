public class SnakeDirection implements Direction
{
    Direction inputDirection;
    int x;
    int y;
    public SnakeDirection(Direction inputDirection)
    {
        x = inputDirection.getX();
        y = inputDirection.getY();
    }
    public int getX()
    {
        if(inputDirection.getX() == 0) return x = inputDirection.getX();
        else return x;
    }
    public int getY()
    {
        if(inputDirection.getY() == 0) return y = inputDirection.getY();
        else return y;
    }

}
