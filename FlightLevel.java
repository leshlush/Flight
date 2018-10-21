import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class FlightLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class FlightLevel extends World
{
    protected int levelNumber;
    protected int frameLength;
    protected ArrayList<Triple<Enemy, Integer, Integer> > enemyFrames;
    
    public FlightLevel(int width, int height, int cellSize, boolean bounded)
    {
        super(width, height, cellSize, bounded);
        enemyFrames = new ArrayList();
        frameLength = 2000;
    }
    
     public FlightLevel(int width, int height, int cellSize)
    {
        this(width, height, cellSize, false);
    }
    
    public void act()
    {
        addEnemies();
        endLevel();
        frameLength--;
    }
    
    public abstract int getLevelNumber();
    
    public void placeEnemy(Enemy e, int frame, int yCoordinate)
    {
        Triple p = new Triple(e, frame, yCoordinate);
        enemyFrames.add(p);
    }
    
    protected void addEnemies()
    {
        for(Triple<Enemy, Integer, Integer> p : enemyFrames)
        {
            if(p.item2 == frameLength)
            {
               addObject(p.item1, getWidth(), p.item3); 
            }
        }
    }
    
    public void endLevel()
    {
        if(frameLength <= 0)
        {
            Greenfoot.setWorld( LevelByNumber.getNextLevel(this) );
        }
    }
    
}
