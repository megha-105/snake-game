import javax.swing.JFrame;

public class GameFrame extends JFrame
{
  

    GameFrame()
    {
        add(new Board());
        setVisible(true);
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(width,height);
        pack();
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new GameFrame();

    }
}
