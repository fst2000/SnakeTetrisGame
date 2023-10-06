import java.awt.Color;

public class FoodCell implements Cell
{
    @Override
    public Drawer getDrawer() {
        return (g, x, y, s) ->
        {
            g.setColor(Color.red);
            g.fillRect(x * s, y * s, s, s);
        };
    }

    @Override
    public Cell nextCellState(Snake snake, Cell[][] map, int x, int y)
    {
        Direction direction = snake.getSnakeDirection();
        if(map[x + direction.getX()][y + direction.getY()].getClass() == FoodCell.class)
        {
            snake.eat();
            return new HeadCell();
        }
        else return this;
    }
    
}
