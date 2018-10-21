import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends FlightLevel
{
    private Player player;
    private Balloon test;
    private EyeCopter test2;
    private int currentFrame = 0;
    private ScoreBoard scoreBoard;
    
    
    public LevelOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 480, 1); 
        levelNumber = 1;
        setPaintOrder(Actor.class, ScoreBoard.class, Star.class);  
        
        player = new Player();
        addObject(player, 100, 240);
        
        scoreBoard = new ScoreBoard();
        addObject( scoreBoard, 100, 50);
        
        test = new Balloon();
        addObject(test, 650, 140);
        
        test2 = new EyeCopter();
        addObject(test2, 650, 340);
        
        StarAnimator.addStars(this);
    }
    
       
    public void act()
    {
        super.act();
        StarAnimator.moveStars(this);
    }
    
    public int getLevelNumber()
    {
        return levelNumber;
    }
    
    
}