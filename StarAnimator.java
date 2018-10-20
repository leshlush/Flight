import greenfoot.*;

/**
 * Write a description of class StarAnimator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarAnimator  
{
   private static Star[] stars;
    
    private static void createStars()
   {
       stars = new Star[100];
       for(int i = 0; i < stars.length; i++)
       {
           Star star = new Star(Greenfoot.getRandomNumber(6) + 2);
           stars[i] = star;
        }
    }
    
   public static void addStars(World world)
   {
       createStars();
       for(int i = 0; i < stars.length; i++)
       {
           int x = Greenfoot.getRandomNumber(world.getWidth());
           int y = Greenfoot.getRandomNumber(world.getHeight());
           world.addObject(stars[i], x, y);
        }
    }
    
   public static void moveStars(World world)
   {
       for(int i = 0; i < stars.length; i++) 
       {
           stars[i].setLocation(stars[i].getX() - stars[i].getSpeed(), stars[i].getY());
           if(stars[i].getX() < 5)
           {
               stars[i].setLocation( stars[i].getWorld().getWidth(), Greenfoot.getRandomNumber(world.getHeight()));
           }
       }
   }
}
