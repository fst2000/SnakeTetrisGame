public class MapCell implements Cell
{
    Cell[][] map;
    int x;
    int y;
    public MapCell(Cell[][] map, int x, int y)
    {
        this.map = map;
        this.x = x;
        this.y = y;
    }
    public Drawer drawer()
    {
        return map[x][y].drawer();
    }
    public CellEnum current()
    {
        return map[x][y].current();
    }
    public CellEnum next()
    {
        return map[x][y].next();
    }
    
}
