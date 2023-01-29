import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{

    static final int width=1200;
    static final int height=700;

    static int size=4;
    static int x[]=new int[Cell.totCount];
    static int y[]=new int[Cell.totCount];   
    
    char direction='R'; 
    static boolean running=false;

    static final int delay = 200;
    Timer timer ;

    Board()
    {
        this.setPreferredSize(new Dimension(width,height));
        this.setBackground(Color.lightGray);
		this.setFocusable(true);  

        this.addKeyListener(new MyKeyAdapter());

        running =true;
        timer=new Timer(delay,this);
        timer.start();
        
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //to write score
        g.setColor(Color.RED);
        g.setFont( new Font("Ink Free",Font.BOLD, 40));
        g.drawString("Score: "+Cell.score, width/2, 35);

        if(running){

            //to draw apple
            g.setColor(Color.RED);
            g.fillOval(Cell.X, Cell.Y, Cell.side, Cell.side);

            //to draw snake
            for(int i =0;i<size;i++){
                if(i==0){
                    g.setColor(Color.BLACK);
                    g.fillOval(x[i], y[i], Cell.side, Cell.side);
                }
                else{
                    g.setColor(Color.BLUE);
                    g.fillOval(x[i],y[i], Cell.side, Cell.side);

                }
            }


        }
        else{
            // gameover 
            g.setColor(Color.RED);
            g.setFont( new Font("Ink Free",Font.BOLD, 100));
            g.drawString("Game Over", width/2, height/2);
        }
    }

    public void move()
    {
        for(int i=size;i>0;i--)
        {
            x[i]=x[i-1];
            y[i]=y[i-1];
        }
        switch(direction){
            case 'R':
                x[0]=x[0]+Cell.side;
                break;
            case 'U':
                y[0]=y[0]-Cell.side;
                break;
            case 'L':
                x[0]=x[0]-Cell.side;
                break;
            case 'D':
                y[0]=y[0]+Cell.side;
                break;
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(running){
            move();
            Cell.checkFood();
            Cell.checkCollision(x,y);
        }
        repaint();
    }

public class MyKeyAdapter extends KeyAdapter
{
    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_LEFT:
            if(direction!='R')
            direction='L';
            break;

            case KeyEvent.VK_RIGHT:
            if(direction!='L')
            direction='R';
            break;

            case KeyEvent.VK_UP:
            if(direction!='D')
            direction='U';
            break;

            case KeyEvent.VK_DOWN:
            if(direction!='U')
            direction='D';
            break;
        }
    }
}
}
