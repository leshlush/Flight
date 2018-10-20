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
    
    public static void animateRivers()
    {
        animateBackgrounds();
        animateForegrounds();
    }
    
    private static void animateBackgrounds()
    {
        for(int i = 0; i < backgrounds.length; i++)
        {
            
            
            backgrounds[i].setLocation(backgrounds[i].getX() - 2, backgrounds[i].getY());
            if(backgrounds[i].getX() <= -1 *(width / 2) )
            {
                backgrounds[i].setLocation( 3 * width / 2, height / 2  );
            }
            
        }  
    }
    
    private static void animateForegrounds()
    {
        for(int i = 0; i < backgrounds.length; i++)
        {
            
            
            foregrounds[i].setLocation(foregrounds[i].getX() - 12, foregrounds[i].getY());
            if(foregrounds[i].getX() <= -1 *(width / 2) )
            {
                foregrounds[i].setLocation( 3 * width / 2, foregrounds[i].getY()  );
            }
            
        }
    }

}
