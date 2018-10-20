import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
    private double exactX;
    private double exactY;      
    protected int damage; 
    protected int scoreValue;
    protected int shield; 
    
    public void act() 
    {
        move();
        hitPlayer();
        hitBeam();
        disappear();
    }   
    
    public abstract void move();
        
    public void hitPlayer()
    {
        Player p = (Player) getOneIntersectingObject(Player.class);
        if(p != null)
        {
           Game.setShield( Game.getShield() - damage  );
            shield = 0;
        }
    }
    
    public void hitBeam()
    {
            Beam b = (Beam) getOneIntersectingObject(Beam.class);
            if(b != null)
            {
                shield = shield - b.getDamage();
                getWorld().removeObject(b);
                if(shield <= 0)
                {
                    Game.setScore( Game.getScore() + scoreValue );
                }
                 
            }
    }
    
    public void disappear()
    {
        if(shield <= 0)
        {
           getWorld().removeObject(this);
        }
    }    
    
    
    /**
     * Move forward by the specified distance.
     * (Overrides the method in Actor).
     */
    @Override
    public void move(int distance)
    {
        move((double)distance);
    }
    
    /**
     * Move forward by the specified exact distance.
     */
    public void move(double distance)
    {
        double radians = Math.toRadians(getRotation());
        double dx = Math.cos(radians) * distance;
        double dy = Math.sin(radians) * distance;
        setLocation(exactX + dx, exactY + dy);
    }
    
    /**
     * Set the location using exact coordinates.
     */
    public void setLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation((int) (x + 0.5), (int) (y + 0.5));
    }
    
    /**
     * Set the location using integer coordinates.
     * (Overrides the method in Actor.)
     */
    @Override
    public void setLocation(int x, int y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }

    /**
     * Return the exact x-coordinate (as a double).
     */
    public double getExactX() 
    {
        return exactX;
    }

    /**
     * Return the exact y-coordinate (as a double).
     */
    public double getExactY() 
    {
        return exactY;
    }
    
    public int getDamage() { return damage; }    
    public int getScoreValue() { return scoreValue; } 
}
