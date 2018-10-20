import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Saucer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Saucer extends Enemy
{  
    private double radians;
    private int stepCount;
    
    public Saucer()
    {
      damage = 10;  
      scoreValue = 100;
      shield = 5;
      radians = 0;
      stepCount = 0;
    }
    
    
    public void move()
    {
        if(stepCount > 125 && radians < 4*Math.PI)
        {    
            parametric();
        }
        else
        {
            setLocation(getX() - 2, getY());
        }
        stepCount++;
    }
    
    public void parametric() 
    {
       
        double x = (5 * Math.cos(radians));
        double y = (5 * Math.sin(radians));
        setLocation(getExactX()  - x, getExactY() + y);
        radians = radians + 0.05; 
        
    }
    
   
}
