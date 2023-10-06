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
    }
}