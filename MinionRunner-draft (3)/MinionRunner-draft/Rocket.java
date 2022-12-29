import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2;
    public void act()
    {
        // Add your action code here.
        move(speed);
        laserCollision();
    }
    
    //OverLoading
    public Rocket(){
        setRotation(-90);
    }
    public Rocket(int speed){
        setRotation(-90);
        this.speed = speed;
    }
    public void laserCollision(){
        if (isTouching(CarEnemy.class)){
            getWorld().addObject(
            new Boom(),
            getX(),
            getY()
            );
            removeTouching(CarEnemy.class);
            getWorld().removeObject(this);
        }else if (isAtEdge())
            getWorld().removeObject(this);
    }
}
