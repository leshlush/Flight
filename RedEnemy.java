import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedEnemy extends Enemy
{
   private int stepCount;
   private boolean firedMissile;
    
   public RedEnemy()
   {
       damage = 10; 
       scoreValue = 100;
       shield = 5;
       stepCount = 0;
       firedMissile = false;
   }
    
    public void move()
    {
        if(stepCount < 100)
        {
            setLocation(getX() - 1, getY());
        }
        
        else if(stepCount > 120 && stepCount < 180 && firedMissile == false)
        {
            getWorld().addObject(new HomingMissile(), getX(), getY() + 20);
            firedMissile = true;
        }
        
        else if(stepCount > 180)
        {
            setLocation(getX(), getY() - 3);
        }
        
        if(getY() < 0)
        {
            shield = 0;
        }
        
        stepCount++;
    }
}
