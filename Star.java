import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{ 
    private int speed;
    
    public Star(int size)
    {
        GreenfootImage img = new GreenfootImage(size, size);
        img.setColor(Color.WHITE);
        img.fillOval( 0, 0, size, size);
        setImage(img);
        speed = size;
    }
    
    public int getSpeed() { return speed; }  
    
}
