public class SnakeDirection implements Direction
{
    Direction inputDirection;
    int x;
    int y;
    public SnakeDirection(Direction inputDirection)
    {
        this.inputDirection = inputDirection;
        x = inputDirection.getX();
        y = inputDirection.getY();
    }
    public int getX()
    {
        if(x != -inputDirection.getX()) return x = inputDirection.getX();
        else return x;
    }
    public int getY()
    {
        if(inputDirection.getY() != y) return y = inputDirection.getY();
        else return y;
    }

}
