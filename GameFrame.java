import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame
{
    public GameFrame(int size)
    {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(size, size);
        setResizable(false);
    }
}
