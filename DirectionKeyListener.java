import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DirectionKeyListener implements KeyListener, Direction
{
    DirEnum d = DirEnum.UP;
    @Override
    public void keyTyped(KeyEvent e)
    {

    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_UP) d = DirEnum.UP;
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) d = DirEnum.RIGHT;
        if(e.getKeyCode() == KeyEvent.VK_DOWN) d = DirEnum.DOWN;
        if(e.getKeyCode() == KeyEvent.VK_LEFT) d = DirEnum.LEFT;
    }
    @Override
    public void keyReleased(KeyEvent e)
    {
    }
    public DirEnum getDirection()
    {
        return d;
    }
}
