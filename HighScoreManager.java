/**
 * Write a description of class HighScoreManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScoreManager   
{
    private static final String highScore = "highscore";
    private static final String topScorer = "topscorer";
    
       
    public static int readHighScore()
    {
        return FileTalker.readIntegerData(highScore);
    }
    
    public static String readTopScorer()
    {
        return FileTalker.readStringData(topScorer);
    }
    
    public static boolean isNewHighScore(int score)
    {
        int currentHighScore = readHighScore();
        if(score > currentHighScore)
        {
            return true;
        }
        return false;
    }
    
    public static void setNewHighScore(String name, int score)
    {
        if( isNewHighScore(score) )
        {
            FileTalker.writeData(topScorer, name);
            FileTalker.writeData(highScore, score);
        }
    }
}
