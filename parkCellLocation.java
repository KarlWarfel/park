
/**
 * Write a description of class parkCellLocation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class parkCellLocation extends park
{
    // instance variables - replace the example below with your own
    public int x;
    public int y;
    public boolean  animalExist;
    public double   animalEnergy;
    public int      animalType;
    public boolean  plantExist;
    public double   plantEnergy;
    public int      plantType;

    /**
     * Constructor for objects of class parkCellLocation
     */
    public parkCellLocation(int x)
    {
        // initialise instance variables
        x = x;
        y = 0;
        animalExist=false;
        plantExist=false;
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
}
