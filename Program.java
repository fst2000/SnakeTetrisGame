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
        Cell [][] map = new Cell[mapSize][mapSize];
        DirectionKeyListener direction = new DirectionKeyListener();
        JFrame frame = new GameFrame(size);
        JPanel mapPanel = new DrawPanel(map, pixelSize);
        frame.add(mapPanel);
        frame.addKeyListener(direction);
        
        for(int x = 0; x < map[0].length; x++)
        {
            for(int y = 0; y < map[1].length; y++)
            {
                map[x][y] = new EmptyCell(
                    new MapCell(map, x, (y + 1) >= mapSize ? 0 : y + 1),
                    new MapCell(map, x, (y - 1) < 0 ? mapSize - 1 : y - 1),
                    new MapCell(map, (x - 1) < 0 ? mapSize -1 : x -1, y),
                    new MapCell(map, (x + 1) >= mapSize ? 0 : x + 1, y), direction);
            }
        }

        map[15][10] = new HeadCell(15, 10, pixelSize);

        while(true)
        {
            for(int x = 0; x < map[0].length; x++)
            {
                for(int y = 0; y < map[1].length; y++)
                {
                    Cell c = map[x][y];
                    if(c.current() != c.next())
                    {
                        if(c.next() == CellEnum.BODY) map[x][y] = new BodyCell(x, y, pixelSize, snakeLength);
                        if(c.next() == CellEnum.EMPTY) map[x][y] = new EmptyCell(
                                    new MapCell(map, x, (y + 1) >= mapSize ? 0 : y + 1),
                                    new MapCell(map, x, (y - 1) < 0 ? mapSize - 1 : y - 1),
                                    new MapCell(map, (x - 1) < 0 ? mapSize -1 : x -1, y),
                                    new MapCell(map, (x + 1) >= mapSize ? 0 : x + 1, y), direction);
                        if(c.next() == CellEnum.HEAD) map[x][y] = new HeadCell(x, y, pixelSize);
                        if(c.next() == CellEnum.TAIL) map[x][y] = new TailCell(x, y, pixelSize);
                        if(c.next() == CellEnum.WALL) map[x][y] = new WallCell(x, y, pixelSize);
                    }
                }
            }
            mapPanel.repaint();
            System.out.println(direction.getDirection());
            try {Thread.sleep(500);}
            catch (Exception e){System.out.println(e);}
        }
    }
}