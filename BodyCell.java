public class BodyCell implements Cell
{
    int lifeTime;
    public BodyCell(int lifeTime)
    {
        this.lifeTime = lifeTime;
    }
    @Override
    public Drawer getDrawer()
    {
        return (g, x, y, s) -> g.fillRect(x * s, y * s, s, s);
    }
    @Override
    public Cell nextCellState(Snake snake, Cell[][] map, int x, int y)
    {
        if(lifeTime > 0) return new BodyCell(lifeTime - 1);
        else return new EmptyCell();
    }  
}
