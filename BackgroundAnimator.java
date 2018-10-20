import greenfoot.*;



public class BackgroundAnimator 
{
   private static GreenfootImage[] frames;
   
  static{
        frames = new GreenfootImage[20];
        
        try{
            buildFrames();
        }
        catch(OutOfMemoryError ex)
        {
            Greenfoot.stop();
           
        }
    }
    
    private static void buildFrames()
    {
        String fileNameFirstHalf = "frame_";
        String fileNameSecondHalf = "_delay-0.03s.gif";
        
        for(int i = 0; i < frames.length; i++)
        {
           String fileName = fileNameFirstHalf + twoDigit(i * 4) + fileNameSecondHalf;
           GreenfootImage img = new GreenfootImage("backgroundFrames/" + fileName);
           img.scale(640, 480);
           frames[i] = img;
        }
        
    }
    
    private static String twoDigit(int digit) 
    {
        if(digit <= 9)
        {
            return "0" + digit;
        }
        String answer = (String) Integer.toString(digit);
        return answer;
    }
    
    public static int getFrameCount()
    {
        return frames.length;
    }
    
    public static GreenfootImage getImage(int index)
    {
        return frames[index];
    }
}
