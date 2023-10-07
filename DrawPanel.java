import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    Cell[][] map;
    int cellSize;
    int sizeX;
    int sizeY;
    public DrawPanel(Cell[][] map, int cellSize)
    {
        this.map = map;
        this.cellSize = cellSize;
        sizeX = map[0].length * cellSize;
        sizeY = map[1].length * cellSize;
        setSize(sizeX, sizeY);
        setPreferredSize(new Dimension(sizeX, sizeY));
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, sizeX, sizeY);
        for(int x = 0; x < map[0].length; x++)
        {
            for(int y = 0; y < map[1].length; y++)
            {
                if(map[x][y] != null)
                map[x][y].getDrawer().draw(g, x, map[1].length - y, cellSize);
            }
        }
    }
}
