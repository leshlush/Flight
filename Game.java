/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game  
{
   private static int score;
   private static int lives;
   private static int shield;
   
   
   static{
       resetDefaults();
    }
    
   public static void resetDefaults()
   {
       score = 0;
       lives = 3;
       shield = 100;
   }
    
   public static int getScore()
   {
       return score;
    }
    
   public static void setScore(int score)
   {
       Game.score = score;
    
    }
    
    public static int getLives()
   {
       return lives;
    }
    
   public static void setLives(int lives)
   {
       Game.lives = lives;
    
    } 
    
    public static int getShield()
   {
       return shield;
    }
    
   public static void setShield(int shield)
   {
       Game.shield = shield;
    
    }  
}
