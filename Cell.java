import java.util.Random;

public class Cell {
    
    static final int side=50;
    static int totCount= (Board.width*Board.height)/(side*side);
    static Random random=new Random();

    //food position
    static int X; 
    static int Y; 

    static int score=0;

    public static void checkFood()
    {
        if(Board.x[0]==X && Board.y[0]==Y){
            Board.size++;
            score++;
            newFood();
        }

    }

    public static void newFood() 
    {
        X=random.nextInt((int)Board.width/Cell.side)*Cell.side;
        Y=random.nextInt((int)Board.height/Cell.side)*Cell.side;
    }

    public static void checkCollision(int x[],int y[])
    {
        for(int i=1;i<Board.size;i++){
            if(x[0]==x[i] && y[0]==y[i])
            Board.running=false;
        }
        
        if(x[0]<0||y[0]<0||x[0]>Board.width||y[0]>Board.height){
            Board.running=false;
        }
    }
}
