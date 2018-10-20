import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
   private Label lives;
   private Label shield;
   private Label score;
   
   public ScoreBoard()
   {
       lives = new Label("Lives: " + Game.getLives(), 20);
       lives.setFillColor(Color.WHITE);
       lives.setLineColor(Color.WHITE);
       score = new Label("Score: " + Game.getScore(), 20);
       score.setFillColor(Color.WHITE);
       score.setLineColor(Color.WHITE);
       shield = new Label("Shield: " + Game.getShield(), 20);       
       shield.setFillColor(Color.WHITE);
       shield.setLineColor(Color.WHITE);
    }
    
   protected void addedToWorld(World world)
   {
       world.addObject(lives, getX() - 45, getY() - 20);
       world.addObject(shield, getX()- 32, getY() );
       world.addObject(score, getX() - 30 , getY() + 20);
   }
   
   public void act()
   {
       lives.setValue("Lives: " + Game.getLives());
       shield.setValue("Shield: " +  Game.getShield());
       score.setValue("Score: " + Game.getScore());
   }
}
