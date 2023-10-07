import java.awt.Color;

public class FoodCell implements Cell
{
    @Override
    public Drawer getDrawer() {
        return (g, x, y, s) ->
        {
            g.setColor(Color.green);
            g.fillRect(x * s, y * s, s, s);
        };
    }

    @Override
    public Cell nextCellState(Snake snake, Cell[][] map, int x, int y)
    {
        Direction direction = snake.getSnakeDirection();
        int checkX = Int.loop(x - direction.getX(), 0, map[0].length - 1);
        int checkY = Int.loop(y - direction.getY(), 0, map[1].length - 1);
        if(map[checkX][checkY].getClass() == HeadCell.class)
        {
            snake.eat();
            return new HeadCell();
        }
        else return this;
    }
    
}
