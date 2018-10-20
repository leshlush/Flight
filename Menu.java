import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    private ArrayList<MenuOption> menuOptions;
    private boolean pressingKey;
    private int currentIndex;
    
    public Menu()
    {
        menuOptions = new ArrayList();
        pressingKey = false;
        currentIndex = 0;
        getImage().setTransparency(0);
    }
    
    protected void addedToWorld(World world)
    {
        for(int i = 0; i < menuOptions.size(); i++)
        {
            MenuOption option = menuOptions.get(i);
            if(i == 0)
            {
                option.select();
            }
            
            world.addObject(option, getX(), getY() + (i * 50));
        }
    }
    
    public void act()
    {
        keyCommands();
    }
    
    public void addOption(MenuOption option)
    {
        menuOptions.add(option);
    }
    
    
    public void selectNext()
    {
        menuOptions.get(currentIndex).deselect();
        currentIndex = (currentIndex + 1);
        
        if(currentIndex >= menuOptions.size())
        {
            currentIndex = 0;
        }
        
        menuOptions.get(currentIndex).select();
    }
    
    public void selectPrevious()
    {
        menuOptions.get(currentIndex).deselect();
        currentIndex = (currentIndex - 1);
        
        if(currentIndex < 0)
        {
            currentIndex = menuOptions.size() - 1;
        }
        
        menuOptions.get(currentIndex).select();
    }
    
    public void keyCommands()
    {
        if(Greenfoot.isKeyDown("up") && !pressingKey)
        {
            selectPrevious();
            pressingKey = true;
        }
        
        if(Greenfoot.isKeyDown("down") && !pressingKey)
        {
            selectNext();
            pressingKey = true;
        }
        
        if(!Greenfoot.isKeyDown("up") && !Greenfoot.isKeyDown("down") && pressingKey)
        {
            pressingKey = false;
        }
    }
    
    
    
    
}
