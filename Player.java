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
       loseLife();
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
    
    public void loseLife()
    {
        if(Game.getShield() <=0)
        {
            Game.setShield(100);
            Game.setLives( Game.getLives() - 1 );
            newLife();
        }
    }
    
    public void resetLevel()
    {
        FlightLevel level = getWorldOfType(FlightLevel.class);
        World reset = LevelByNumber.getLevelByNumber( level.getLevelNumber());
        Greenfoot.setWorld(reset);
    }
    
    public void newLife()
    {
        if(Game.getShield() <= 0 && Game.getLives() <= 0)
        {
            Greenfoot.setWorld(new End());
        }
        else
        {
            resetLevel();
        }
    }
}
