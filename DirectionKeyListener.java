import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DirectionKeyListener implements KeyListener, Direction
{
    private int x = 0;
    private int y = 1;
    @Override
    public void keyTyped(KeyEvent e)
    {

    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_UP) {y = 1; x = 0;}
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {y = 0; x = 1;}
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {y = -1; x = 0;}
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {y = 0; x = -1;}
    }
    @Override
    public void keyReleased(KeyEvent e)
    {
    }
    @Override
    public int getX()
    {
        return x;
    }
    @Override
    public int getY() {
        return y;
    }
}
