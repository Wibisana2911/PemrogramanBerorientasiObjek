import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Minion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minion extends Actor
{
    int score = 0;
    int lives = 5;
    int bananaEaten = 0;
    public void act()
    {
        minionMovement();
        //checkCollision();
        showStatus();
        eatBanana();
        //touchCar();
        //touchMinion();
        finishGame();
        shootRocket();
        getTouch();
        score++;
        
        endGame();
    }
    
    public void minionMovement()
    {
        if (Greenfoot.isKeyDown("A"))
        {
            if(getX()>=200){
                setLocation(getX()-5,getY());
            }
        }
        if (Greenfoot.isKeyDown("D"))
        {
            if(getX()<=500){
                setLocation(getX()+5,getY());
            }
        }
    }
    public void eatBanana()
    {
        if (isTouching(Banana.class))
        {
            showStatus();
            bananaEaten++;
            removeTouching(Banana.class);
            Greenfoot.playSound("eat.wav");
        }
    }
    
    public void shootRocket(){
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Rocket(), getX(),getY()-50);
        }
    }
    
    public void getTouch()
    {
        if(isTouching(CarEnemy.class)||isTouching(Racun.class))
        {
            getWorld().addObject(new Boom(),getX(),getY());
            //setLocation(112,180);
            showStatus();
            lives--;
            removeTouching(CarEnemy.class);
            Greenfoot.playSound("Explosion.wav");
        }   
    }

    /*public void touchCar()
    {
        if (isTouching(CarEnemy.class))
        {
            
        }
    }
    
    public void touchMinion()
    {
        if (isTouching(MinionEnemy.class))
        {
            getWorld().addObject(new Boom(),getX(),getY());
            showStatus();
            lives--;
            removeTouching(MinionEnemy.class);
            Greenfoot.playSound("Explosion.wav");
        }
    }*/
    
    public void removeLive()
    {
        showStatus();
        lives--;
        endGame();
    }
    public void increaseScore(){
        score++; 
        showStatus();
    }
    public void showStatus(){
        getWorld().showText("Score   : "+score,71,530);
        getWorld().showText("Banana : "+bananaEaten,71,550);
        getWorld().showText("Lives  : "+lives,71,570);
    }
    public void endGame(){
        if(lives<1)
        {
            getWorld().showText("Game Over\nScore :  " + score/10, 250, 300);
            showStatus();
            Greenfoot.playSound("intro.mp3");
            Greenfoot.stop();
        }
    }   
    
    public void finishGame(){
        if(bananaEaten==20){
            getWorld().showText("Game Finish\nScore :  " + score/10, 250, 300);
            showStatus();
            Greenfoot.playSound("intro.mp3");
            Greenfoot.stop();
        }
        else{
            //Greenfoot.playSound("musik minion.mp3");
    }
}
    
    public void addscore(){
        if(isTouching(Banana.class)){
            showStatus();
            bananaEaten++;
            removeTouching(Banana.class);
            Greenfoot.playSound("eat.wav");
        }
    }
    
    public void checkCollision() // increases damage of car when it hits a Vehicle.
    {
        Actor actor = getOneIntersectingObject(CarEnemy.class);
        if (actor != null)
        {
            setLocation(350,550);
            Greenfoot.playSound("Explosion.wav");
            removeLive();
        }
    
    }
    
}
