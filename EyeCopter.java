import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EyeCopter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EyeCopter extends Enemy
{
   private int stepCount;
    
    public EyeCopter()
   {
       damage = 10; 
       scoreValue = 100;
       shield = 5;
       stepCount = 0;
   }
    
    
   public void move()
   { 
       double yMovement = -Math.log10(getExactX())  + 2;
       setLocation(getExactX() - 3, getExactY() + yMovement);       
    }
}
