
/**
 * Write a description of class park here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class park
{
    // instance variables - replace the example below with your own
    public int x;
    private int y;
    private int maxX = 100;
    private parkCellLocation parkLocation[];

    /**
     * Constructor for objects of class park
     */
    public park()
    {
        // initialise instance variables
        x = 0;
        y = 0;
        maxX = 100;
        //parkLocation.add = 0;
        parkLocation = new parkCellLocation[100];
      
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public int initPark(int x)
    {
        
        
        parkLocation[x].x = x;
        parkLocation[x].y = (x/10);
        if (x < maxX) initPark(x+1);
        return 1 ;
    
    }
        
}


