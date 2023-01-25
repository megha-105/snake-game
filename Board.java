import java.awt.*;
import javax.swing.*;
// import javax.swing.JPanel;

public class Board extends JPanel {

    static final int width=1200;
    static final int height=700;

    Board()
    {
        setPreferredSize(new Dimension(width,height));
        setBackground(Color.lightGray);
    }

    // public void paint(Graphics g){
    //     Graphics2D g2d =(Graphics2D)g;

    //     g2d.setColor(Color.RED);
    //     g2d.setStroke(new BasicStroke(4));
    //     g2d.drawRect(20, 40, 100,200);
    //     setOpaque(false);
    // }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //to draw apple
        g.setColor(Color.RED);
        g.fillOval(Cell.X, Cell.Y, Cell.side, Cell.side);

        //to draw snake
        new snake();
        for(int i =0;i<snake.size;i++){
            if(i==0){
                g.setColor(Color.BLACK);
                g.fillOval(snake.x[i], snake.y[i], Cell.side, Cell.side);
            }
            else{
                g.setColor(Color.BLUE);
                g.fillOval(snake.x[i], snake.y[i], Cell.side, Cell.side);

            }
        }

        //to write score
        g.setColor(Color.RED);
			g.setFont( new Font("Ink Free",Font.BOLD, 40));
        g.drawString("Score", width/2, 35);

    }
}
