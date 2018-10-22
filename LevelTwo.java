import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */ 
public class LevelTwo extends FlightLevel
{
    private Player player;
    private ScoreBoard scoreBoard;
    
    /**
     * Constructor for objects of class LevelTwo.
     * 
     */
    public LevelTwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 480, 1, false); 
        levelNumber = 2;
        setPaintOrder(Actor.class, ScoreBoard.class, RiverForeground.class, RiverBackground.class);
        
        scoreBoard = new ScoreBoard();
        addObject( scoreBoard, 100, 50);        
        
        player = new Player();
        addObject(player, 100, 240);
                  
        RiverAnimator.addRivers(this);
    }
    
    public void act()
    {
        super.act();
    }
    
    public int getLevelNumber()
    {
        return levelNumber;
    }
    
    @Override
    public void placeAllEnemies()
    {
        
    }
}
