import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class HomingMissile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomingMissile extends Enemy
{
   private double t;   
   private Player target; 
   private int offset;
   private double waveHeight; 
   public HomingMissile()
   {
      damage = 50;
      scoreValue = 100;
      shield = 5;
      t = 0;
      waveHeight = 16;
   }
   
   protected void addedToWorld(World world)
   {
       target = getPlayer(); 
   }
   
   public void move()
   {
       double yMovement= Math.sin(getX() / 30 ) * waveHeight;
       setLocation(getExactX() - 0.75, getExactY() + yMovement);
       waveHeight = waveHeight *.99;
       
       turnTowards(target.getX(), target.getY());
       move(2);
      
   }
   
   public Player getPlayer()
   {
       return getWorld().getObjects(Player.class).get(0);
   }
   
  
  
}
