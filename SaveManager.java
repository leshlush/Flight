/**
 * Write a description of class SaveManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaveManager  
{
   private static final String score  = "Score";
   private static final String shield = "Shield";
   private static final String lives = "Lives";
   private static final String level = "Level";
   
    public static int readScore()
    {
        return FileTalker.readIntegerData(score);
    }
    
    public static int readShield()
    {
        return FileTalker.readIntegerData(shield);
    }
    
    public static int readLives()
    {
        return FileTalker.readIntegerData(lives);
    }
    
    public static int readLevel()
    {
        return FileTalker.readIntegerData(level);
    }
    
    public static void writeScore(int score)
    {
        FileTalker.writeData(SaveManager.score, score);
    }
    
    public static void writeShield(int shield)
    {
        FileTalker.writeData(SaveManager.shield, shield);
    }
    
    public static void writeLives(int lives)
    {
        FileTalker.writeData(SaveManager.lives, lives);
    }
    
    public static void writeLevel(int level)
    {
        FileTalker.writeData(SaveManager.level, level);
    }
}
