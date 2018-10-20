import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beam extends Actor
{
    private int speed;
    private int damage;
    
    public Beam()
    {
        speed = 20;
        damage = 1;
    }
    
    public void act() 
    {
       move();
       disappear();
    }    
    
    public void move()
    {
        setLocation(getX() + speed, getY());
    }
    
    public void disappear()
    {
        if(getX() >= getWorld().getWidth() - 10)
        {
            getWorld().removeObject(this);
        }
    }
    
    public int getDamage() { return damage; } 
}
