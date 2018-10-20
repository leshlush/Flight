import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public abstract class MenuOption extends Actor
{
    private Label title;
    private boolean selected;
    private boolean enterReleased ;
    
    public MenuOption(String titleText)
    {
        title = new Label(titleText, 30);
        selected = false;
        enterReleased = false;
        getImage().setTransparency(0);
    }
    
    protected void addedToWorld(World world)
    {
        world.addObject(title, getX(), getY());
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            enterReleased = true;
        }
        
        if(selected && !Greenfoot.isKeyDown("enter") && enterReleased)
        {
            enterReleased = false;
            performAction();
        }
    }
    
    public abstract void performAction();    
           
    public void select()
    {
        selected = true;
        title.setFillColor(Color.yellow);
    }
    
    public void deselect()
    {
        selected = false;
        title.setFillColor(Color.white);
    }
}
