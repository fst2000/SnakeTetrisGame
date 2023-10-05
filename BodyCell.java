
import java.awt.Color;

public class BodyCell implements Cell
{
    int x;
    int y;
    int size;
    int snakeLength;
    public BodyCell(int x, int y, int size, int snakeLength)
    {
        this.x = x;
        this.y = y;
        this.size = size;
        this.snakeLength = snakeLength;
    }
    public Drawer drawer()
    {
        return g ->
        {
            g.setColor(Color.RED);
            g.fillRect(x * size , y * size, size, size);
        };
    }
    public CellEnum current()
    {
        return CellEnum.BODY;
    }
    public CellEnum next()
    {
        if(snakeLength - 1 > 0)
        {
            snakeLength--;
            return CellEnum.BODY;
        }
        else return CellEnum.TAIL;
    }
}
