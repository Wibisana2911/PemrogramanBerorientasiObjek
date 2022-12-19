import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Minion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minion extends Actor
{
    /**
     * Act - do whatever the Minion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        minionMovement();
    }
    
    public void minionMovement()
    {
        if (Greenfoot.isKeyDown("A"))
        {
            setLocation(getX()-5,getY());
            animate();
        }
        if (Greenfoot.isKeyDown("D"))
        {
            setLocation(getX()+5,getY());
            animate();
        }
    }
    private GreenfootImage minion_mid;
    private GreenfootImage minion_LeftUp;
    private GreenfootImage minion_rightUp;
    public Minion()
    {
        minion_mid=new GreenfootImage("minion_mid.png");
        minion_LeftUp=new GreenfootImage("minion_LeftUp.png");
        minion_rightUp=new GreenfootImage("minion_rightUp.png");
    }
    public void animate()
    {
        if(getImage()==minion_mid){
            setImage(minion_rightUp);
        }else{
            setImage(minion_LeftUp);
        }  
    }
}
