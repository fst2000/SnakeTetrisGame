import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    Cell[][] map;
    int pixelSize;
    public DrawPanel(Cell[][] map, int pixelSize)
    {
        this.map = map;
        this.pixelSize = pixelSize;
        int panelSize = map.length * pixelSize;
        setSize(panelSize, panelSize);
    }
    @Override
    public void paint(Graphics g)
    {
        for(int x = 0; x < map[0].length; x++)
        {
            for(int y = 0; y < map[1].length; y++)
            {
                if(map[x][y] != null)
                map[x][y].drawer().draw(g);
            }
        }
    }
}
