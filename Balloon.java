import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon extends Enemy
{
   public Balloon()
   {
       damage = 10; 
       scoreValue = 100;
       shield = 5;
   }
     
    @Override
    public void move()
   {
       double yMovement= Math.sin(getX() / 30 ) * 3;
       setLocation(getExactX() - 0.75, getExactY() + yMovement);
    }
}
