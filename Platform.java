import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.lang.Math;

public class Platform extends Actor
{
    private ArrayList<Grass> plat = new ArrayList();
    private int length;
    private int height;
    
    public Platform(int height){
        length = (int)( Math.random()*50)+20;
        this.height = height;
        
        Grass g = new Grass();
        plat.add(g);
        getWorld().addObject(g, getWorld().getWidth()-20, height);
        
    }
    
    public void act() 
    {
        
    }    
}
