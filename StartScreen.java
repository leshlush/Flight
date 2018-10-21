import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    private Label logo;
    private Menu menu;    
    
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 480, 1); 
        Game.resetDefaults();
        LevelByNumber.reset();
        
        setPaintOrder(Label.class, Star.class);
        
        logo = new Label("FLIGHT", 75);
        logo.setFillColor(Color.gray);
        addObject(logo, 350, 100);
        
        menu = new Menu();
        menu.addOption(new Start());
        menu.addOption(new Continue());
        addObject(menu, 350, 220);
        
        StarAnimator.addStars(this);
    }
    
    
     public void act()
    {
       StarAnimator.moveStars(this);
    }
    
      
    private class Start extends MenuOption
    {
        public Start()
        {
            super("Start");
        }
        
        public void performAction()
        {
            Greenfoot.setWorld(new LevelOne());
        }
    }
    
    private class Continue extends MenuOption
    {
        public Continue()
        {
            super("Continue");
        }
        
        public void performAction()
        {
            Greenfoot.stop();
        }
    }
}
