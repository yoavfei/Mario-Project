import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        super(1000, 500, 1); 
        setBackground(new GreenfootImage("mariobackground2.jpg"));
        
        addObject(new Mario(5), 50, 400);
        
    }
    
    
}
