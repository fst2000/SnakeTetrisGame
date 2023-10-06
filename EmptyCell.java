public class EmptyCell implements Cell
{
    public Drawer getDrawer()
    {
        return (g, x, y, s) -> {};
    }
    public Cell nextCellState(Snake snake, Cell[][] map, int x, int y)
    {
        Direction direction = snake.getSnakeDirection();
        if(map[x - direction.getX()][y - direction.getY()].getClass() == HeadCell.class) return new HeadCell();
        else return this;
    }
    
}
