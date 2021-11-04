import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.lang.Math;

public class Mario extends Actor
{
    private int speed;
    private int gravity =1;
    private int velocity =0;
    private int timer = 0;
    
    private int length = -2;
    private int currentLength = 0;
    
    private ArrayList<Platform> platList = new ArrayList<Platform>();
    
    public Mario(int speed){
        this.speed = speed;
        
    }
    
    public void act() 
    {
        
        
        
        if(Greenfoot.isKeyDown("right")){
           move(speed);
           
           length++;
           if(currentLength>length){
                formPlatform();
                length = 0;
           }
           else{
               movePlatforms(speed);
            }
        }
        else if(Greenfoot.isKeyDown("left")){
            move(speed*-1);
            
            length--;
            movePlatforms(speed);
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
    
    //1 is right, -1 is left
    public void movePlatforms(int side){
        for(int i = 0; i<platList.size();i++){
             System.out.println(platList.size());
            platList.get(i).move(side);
           
        }
        
    }
    
    public void formPlatform(){

        int height = (int)(Math.random()*200)+100;
       
        length = (int)(Math.random()*500)+10;
        Platform plat = new Platform(height, length);
         
        platList.add(plat);
        
        
        getWorld().addObject(plat, getWorld().getWidth()-20, height);
        plat.makeGrass();
        

    }
    
    
     
    

}
