import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int speed;
    private boolean shootButton;
    
    public Player()
    {
     speed = 4;
     shootButton = false;
    }
    
    
    public void act() 
    {
       keyCommands();
       endGame();
    }  
    
     public void keyCommands()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            moveUp();
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            moveDown();
        }
        
        if(Greenfoot.isKeyDown("space") && !shootButton)
        { 
            shoot();
            shootButton = true;
        }
        
         if(!Greenfoot.isKeyDown("space") && shootButton)
        {
            shootButton = false;
        }
        
        if(Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(new Pause(  (FlightLevel) getWorld() ));
        }
    }
    
    public void moveUp()
    {
        setLocation(getX() , getY() - speed);
    }
    
    public void moveDown()
    {
        setLocation(getX() , getY() + speed);
    }
    
    public void shoot()
    {
        getWorld().addObject(new Beam(), getX(), getY() );
    }
    
    public void endGame()
    {
        if(Game.getShield() <= 0)
        {
            Greenfoot.setWorld(new End());
        }
    }
}
