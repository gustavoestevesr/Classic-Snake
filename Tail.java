import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tail extends Actor
{
    public Tail(){
        getImage().setColor( Color.GREEN );
        getImage().fillRect( 0 , 0 , 40 , 40 );
    }
    
    int cont;
    public void act()
    {
        cont++;
        if( cont > 60 ){
            getWorld().removeObject(this);
        }
    }
}
