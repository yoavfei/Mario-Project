import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Grass extends Actor
{
  private int size;
    
    public Grass(){
        size = 10;
        
    }
    public void act() 
    {
        // Add your action code here.
    } 
    
    public void move(int side){
        move(side);
        System.out.println("oink");
        
    }
}
