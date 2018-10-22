import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class End extends World
{
    private Label logo;
    private Label scorer;
    private Menu menu; 
    
    
    public End()
    {    
        super(700, 480, 1); 
        
        logo = new Label("HIGH SCORE: ", 40);
        logo.setFillColor(Color.red);
        addObject(logo, 350, 100);
        
                
        menu = new Menu();
        menu.addOption(new Retry());
        menu.addOption(new Quit());
        addObject(menu, 350, 220);
        
        StarAnimator.addStars(this);
    }
    
    public void act()
    {
        StarAnimator.moveStars(this);
    }
    
       
    public class Retry extends MenuOption
    {
        public Retry()
        {
            super("Retry");
        }   
        
        public void performAction()
        {
           Greenfoot.setWorld(new StartScreen());     
        }        
    }
    
    public class Quit extends MenuOption
    {
        public Quit()
        {
            super("Quit");
        }   
        
        public void performAction()
        {
           System.exit(0);     
        }        
    }
}
