import java.awt.Color;

public class HeadCell implements Cell
{
    int x;
    int y;
    int size;
    public HeadCell(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }
    public Drawer drawer()
    {
        return g ->
        {
            g.setColor(Color.ORANGE);
            g.fillRect(x * size , y * size, size, size);
        };
    }
    public CellEnum current()
    {
        return CellEnum.HEAD;
    }
    public CellEnum next()
    {
        return CellEnum.BODY;
    }
}
