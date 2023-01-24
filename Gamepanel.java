import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gamepanel extends JPanel {

    Gamepanel()
    {
        setBackground(Color.orange);
        int score=0;
        JLabel l=new JLabel("Score");
        add(l);
    }

    // public void paint(Graphics g){
    //     Graphics2D g2d =(Graphics2D)g;

    //     g2d.setColor(Color.RED);
    //     g2d.setStroke(new BasicStroke(4));
    //     g2d.drawRect(20, 40, 100,200);
    //     setOpaque(false);
    // }
}
