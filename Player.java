import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    public Player(){
        getImage().setColor( Color.GREEN );
        getImage().fillRect( 0 , 0 , 40 , 40 );
    }
    
    public void act()
    {              
        generateTail();
        movement();  
        score();
    }
    
    public void generateTail(){
        getWorld().addObject( new Tail(), getX() , getY() );
    }
    
    public void movement(){
        move( 5 );        
        if( Greenfoot.isKeyDown("up") ){
            setRotation(270);
        }
        if( Greenfoot.isKeyDown("down") ){
            setRotation(90);
        }
        if( Greenfoot.isKeyDown("left") ){
            setRotation(180);
        }
        if( Greenfoot.isKeyDown("right") ){
            setRotation(0);
        }   
    }
    
    int score = 0;
    public void score(){
        if( getOneIntersectingObject(Apple.class) != null ){
            score++;
        }  
        getWorld().showText("score: "+score, 50, 25);
    }
}