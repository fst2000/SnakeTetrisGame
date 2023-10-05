public class WallCell implements Cell
{
    int x;
    int y;
    int size;
    public WallCell(int x, int y, int size)
    {
        this.x = x;
        this.y = y;
        this.size = size;
    }
    @Override
    public Drawer drawer()
    {
        return g -> g.fillRect(x * size, y * size, size, size);
    }
    @Override
    public CellEnum current()
    {
        return CellEnum.WALL;
    }

    @Override
    public CellEnum next()
    {
        return CellEnum.WALL;
    }
        
}
