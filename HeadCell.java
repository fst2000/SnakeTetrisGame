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
        Direction direction = snake.getSnakeDirection();
        int checkX = Int.Loop(x + direction.getX(), 0, map[0].length);
        int checkY = Int.Loop(y + direction.getY(), 0, map[1].length);
        if(map[checkX][checkY].getClass() == BodyCell.class)
        {
            snake.die();
            return this;
        }
        return new BodyCell(snake.getLength());
    }
    
}
