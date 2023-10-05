import java.awt.Color;

public class TailCell implements Cell
{
    int x;
    int y;
    int size;
    public TailCell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
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
        return CellEnum.TAIL;
    }
    public CellEnum next()
    {
        return CellEnum.EMPTY;
    }
}

