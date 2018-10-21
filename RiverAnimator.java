import greenfoot.*;

/**
 * Write a description of class RiverAnimator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RiverAnimator 
{
    private static RiverBackground[] backgrounds = { new RiverBackground(), new RiverBackground()  } ;
    private static RiverForeground[] foregrounds = { new RiverForeground(), new RiverForeground() } ;
    private static int height = backgrounds[0].getImage().getHeight();
    private static int width = backgrounds[0].getImage().getWidth();
    
    public static void addRivers(World world)   
    {
        world.addObject(backgrounds[0], width / 2, height / 2);
        world.addObject(backgrounds[1], 3 * width / 2, height / 2);
        world.addObject(foregrounds[0], width / 2, 407);
        world.addObject(foregrounds[1], 3 * width / 2, 407);
    }
    
    

}
