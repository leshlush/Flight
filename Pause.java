import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Pause here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pause extends World
{
    private Label logo;
    private Menu menu;    
    private FlightLevel currentWorld;
    
    /**
     * Constructor for objects of class Pause.
     * 
     */
    public Pause(FlightLevel currentWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 480, 1); 
        
        this.currentWorld = currentWorld;
        
        logo = new Label("PAUSE", 75);
        logo.setFillColor(Color.gray);
        addObject(logo, 350, 100);
         
       
    }
    
   
}
