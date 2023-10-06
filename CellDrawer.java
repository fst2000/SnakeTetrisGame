import java.awt.Graphics;

public class CellDrawer implements Drawer
{
    int x;
    int y;
    int size;
    @Override
    public void draw(Graphics g) {
        g.fillRect(x * size, y * size, size, size);
    }
    
}
