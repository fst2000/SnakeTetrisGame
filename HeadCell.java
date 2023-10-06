import java.awt.Color;

public class HeadCell implements Cell
{
    @Override
    public Drawer getDrawer() {
        return (g, x, y, s) ->
        {
            g.setColor(Color.ORANGE);
            g.fillRect(x * s, y * s, s, s);
        };
    }
    @Override
    public Cell nextCellState(Snake snake, Cell[][] map, int x, int y)
    {
        Int2 direction = snake.getSnakeDirection();
        if(map[x + direction.getX()][y + direction.getY()].getClass() == BodyCell.class) return new EmptyCell();
        else return new BodyCell(snake.getLength());
    }
    
}
