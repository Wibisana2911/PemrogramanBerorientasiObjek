import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    int enemyCount = 0;
    public void act()
    {
        enemyCount = (enemyCount+1)%300;
        if(enemyCount==0)
        {
         spawnEnemy();   
        }
    }
    public int timerEnemy = 0;
    public void spawnEnemy()
    {
        //if(Greenfoot.getRandomNumber(400)<1)
    if (timerEnemy==180)
        {
            addObject(new Enemy(),599,Greenfoot.getRandomNumber(400));
            timerEnemy = 0;
        }else{
            timerEnemy++;
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,57,194);
        Enemy enemy = new Enemy();
        addObject(enemy,556,199);
        enemy.setLocation(530,189);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,414,74);
        enemy2.setLocation(347,67);
        enemy.setLocation(527,185);
        Boom boom = new Boom();
        addObject(boom,527,185);
        Laser laser = new Laser();
        addObject(laser,232,192);
        laser.setLocation(238,192);
    }
}
