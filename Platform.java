import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.lang.Math;

public class Platform extends Actor
{
    private ArrayList<Grass> plat = new ArrayList<Grass>();
    private int length;
    private int height;
    
    public Platform(int height, int length){
        
        this.height = height;
        this.length = length;

    }
    
    public void act() 
    {
        
    }    
    
    public void move(int side){
        for(int i = 0; i<plat.size();i++){
            plat.get(i).move(side);
            System.out.println("Banana");
        }
        makeGrass();
    }
    
    public void makeGrass(){
        Grass g = new Grass();
        plat.add(g);
        getWorld().addObject(g, getWorld().getWidth()-20, height);
        
    }
}
