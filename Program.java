import javax.swing.JFrame;
import javax.swing.JPanel;

public class Program
{
    public static void main(String[] args)
    {
        int size = 512;
        int mapSize = 64;
        int pixelSize = size / mapSize;
        int snakeLength = 5;
        DirectionKeyListener input = new DirectionKeyListener();
        Snake snake = new Snake(snakeLength, new SnakeDirection(input));
        Cell [][] map = new Cell[mapSize][mapSize];
        Cell[][] buffer = new Cell[mapSize][mapSize];
        JFrame frame = new GameFrame(size);
        JPanel mapPanel = new DrawPanel(map, pixelSize);
        frame.add(mapPanel);
        frame.addKeyListener(input);

        for(int x = 0; x < map[0].length; x++)
        {
            for(int y = 0; y < map[1].length; y++)
            {
                map[x][y] = new EmptyCell();
            }
        }
        map[31][31] = new HeadCell();

        while(snake.isDead() == false)
        { 
            for(int x = 0; x < map[0].length; x++)
            {
                for(int y = 0; y < map[1].length; y++)
                {
                    buffer[x][y] = map[x][y].nextCellState(snake, map, x, y);
                }
            }
            for(int x = 0; x < map[0].length; x++)
            {
                for(int y = 0; y < map[1].length; y++)
                {
                    map[x][y] = buffer[x][y];
                }
            }
            mapPanel.repaint();
            try {Thread.sleep(500);}
            catch (Throwable e) {System.out.println(e);}
        }
    }
}