import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy()
    {
        setRotation(180);
    }
    public Enemy (int speed)
    {
        setRotation(180);
        this.speed = speed;
    }
    
    public int speed = 3;
    public void act()
    {
        move(speed);
        if (isAtEdge())
            {
            getWorld().removeObject(this);
            }
    }
    
    public int speed = 1;
    
    public void act() //60 per detik
    {
        // Add your action code here.
        //setRotation(180);
        move(speed);
        removeEnemy();       
        shootLaser();
    }
    
    int laserTimer = 0;
    public void shootLaser()
    {
        if (laserTimer == 120)
        {
            getWorld().addObject(
            new LaserEnemy(),
            getX() - 60,
            getY()
            );
            laserTimer = 0;
        }
        else
        {
            laserTimer++;
        }
        }
    }

