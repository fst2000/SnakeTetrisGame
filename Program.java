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
        int foodAmount = 2;
        DirectionKeyListener input = new DirectionKeyListener();
        Snake snake = new Snake(snakeLength, input);
        Cell [][] map = new Cell[mapSize][mapSize];
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
        map[mapSize / 2 - 1][mapSize / 2 - 1] = new HeadCell();
        while(snake.isDead() == false)
        {
            Cell[][] buffer = new Cell[mapSize][mapSize];
            int foodCounter = 0;
            for(int x = 0; x < map[0].length; x++)
            {
                for(int y = 0; y < map[1].length; y++)
                {
                    Cell current = map[x][y];
                    buffer[x][y] = current.nextCellState(snake, map, x, y);
                    if(current.getClass() == HeadCell.class) System.out.print("Head position : " + x + " " + y);
                    if(current.getClass() == FoodCell.class) foodCounter++;
                }
            }
            for(int x = 0; x < map[0].length; x++)
            {
                for(int y = 0; y < map[1].length; y++)
                {
                    map[x][y] = buffer[x][y];
                }
            }
            if(foodCounter < foodAmount)
            {
                int spawnX = (int)(Math.random() * map[0].length);
                int spawnY = (int)(Math.random() * map[1].length);
                map[spawnX][spawnY] = new FoodCell();
                System.out.print(" new food spawned at " + spawnX + " " + spawnY);
            }
            mapPanel.repaint();

            System.out.print(snake.isDead()? " dead" : " alive");
            System.out.println(" direction: " + snake.getSnakeDirection().getX() + " " + snake.getSnakeDirection().getY());
            try {Thread.sleep(50);}
            catch (Throwable e) {System.out.println(e);}
        }
    }
}