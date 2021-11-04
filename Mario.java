import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.lang.Math;

public class Mario extends Actor
{
    private int speed;
    private int gravity =1;
    private int velocity =0;
    private int timer = 0;
    
  
    
    public Mario(int speed){
        this.speed = speed;
        
    }
    
    public void act() 
    {
        
        
        
        if(Greenfoot.isKeyDown("right")){
           move(speed);
           adjust(speed);
           formPlatform();
        }
        else if(Greenfoot.isKeyDown("left")){
            move(speed*-1);
            adjust(-speed);
        }
        if(Greenfoot.isKeyDown("up")){
            timer++;
            if(timer<3){
            
                velocity = 15;
                setLocation(getX(), getY()-velocity);
                
            }
            
        }
        if(getY()-velocity>400){
            velocity=0;
            setLocation(getX(), 400);
            timer = 0;
            
        }
        else{
            setLocation(getX(), getY()-velocity);
            velocity-=gravity;
        }
        
    }  
    
    public void adjust(int num){
        
        
    }
    
    public void formPlatform(){
        
        
        
        
        int height = (int)(Math.random()*200)+100;

        getWorld().addObject(new Platform(height), getWorld().getWidth()-20, height);

        
        
        
        
    }
    
    
     
    

}
