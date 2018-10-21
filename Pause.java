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
         
        menu = new Menu();
        menu.addOption(new Return());
        menu.addOption(new Save());
        addObject(menu, 350, 220);
    }
    
    private class Save extends MenuOption
    {
        public Save()
        {
            super("SAVE");
        }
        
        public void performAction()
        {
            SaveManager.writeScore(Game.getScore());
            SaveManager.writeShield(Game.getShield());
            SaveManager.writeLives(Game.getLives());
            SaveManager.writeLevel(currentWorld.getLevelNumber());
            
            Label saved = new Label("Game Saved!", 40);
            addObject(saved, 350, 300);
        }
    }
    
    private class Return extends MenuOption
    {
        public Return()
        {
            super("RETURN");
        }
        
        public void performAction()
        {
            Greenfoot.setWorld(currentWorld);
        }
    }
}
