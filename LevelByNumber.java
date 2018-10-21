import greenfoot.*;
import java.util.HashMap;

/**
 * Write a description of class LevelByNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelByNumber  
{
    private static HashMap<Integer, FlightLevel> levels;
    
    static
    {
        reset();
    }
    
    public static void reset()
    {
        levels = new HashMap();
        
        LevelOne levelOne = new LevelOne();
        levels.put(levelOne.getLevelNumber(), levelOne);
        
        LevelTwo levelTwo = new LevelTwo();
        levels.put(levelTwo.getLevelNumber(), levelTwo);
    }
    
    public static FlightLevel getLevelByNumber(Integer number)
    {
        FlightLevel level = levels.get(number);
        try{ 
            Class<? extends FlightLevel> cls = level.getClass();
            level = cls.newInstance();
        }
        catch(Exception ex){ }
        return level;
    }
    
    public static World getNextLevel(FlightLevel level)
    {
        int nextLevelNumber = level.getLevelNumber() + 1;
        if(levels.containsKey(nextLevelNumber))
        {
            return levels.get(nextLevelNumber);
        }
        return new End();
    }
  
}
