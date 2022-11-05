import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public Apple(){
        getImage().setColor( Color.RED );
        getImage().fillRect( 0 , 0 , 10 , 10 );
    }
    public void act()
    {
        collisionWithPlayer();
    }
    public void collisionWithPlayer(){
        if( this.isTouching(Player.class) ){
            setLocation(
                Greenfoot.getRandomNumber(800)
                    , Greenfoot.getRandomNumber(600) );
        }
    }
}



