import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        // Change color to black
        getBackground().setColor(Color.BLACK);
        // Fill the screen with the color
        getBackground().fill();
        
        // Create Apple
        Apple apple = new Apple();
        // Add Player in the screen
        addObject( apple , 700 , 200 );
        
        // Create Player
        Player player = new Player();
        // Add Player in the screen
        addObject( player , 400 , 300 );        
    }
}
