import javax.swing.JFrame;

public class Game extends JFrame
{
  

    Game()
    {
        add(new Board());
        Cell.newFood();
        
        setVisible(true);
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }
    
    
    public static void main(String[] args) {
        new Game();

    }
}
