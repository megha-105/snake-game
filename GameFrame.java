import javax.swing.JFrame;

public class GameFrame extends JFrame
{
    static final int width=500;
    static final int height=500;


    GameFrame()
    {
        add(new Gamepanel());
        setVisible(true);
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width,height);
        // pack();
        setLocationRelativeTo(null);
    }
    
}
