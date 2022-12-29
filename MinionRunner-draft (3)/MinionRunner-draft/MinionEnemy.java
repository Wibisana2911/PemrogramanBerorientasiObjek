import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MinionEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinionEnemy extends CarEnemy
{
    int laserTimer = 0;
    public void act(){
        move(speed);
        if (laserTimer == 120){
            getWorld().addObject(
            new Racun(),
            getX(),
            getY()+30
            );
            laserTimer = 0;
        }else{
            laserTimer++;
        }
        edge();
    }
}
