import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (Thane Hudelson) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall ("edge.png"), 25 + 50*i, 12);
        }
        
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall ("edge.png"), 25 + 50*i, 587);
        }
        
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge2.png"), 12, 15 + 50*i);
        }
        
        for(int i = 0; i < 16; i++)
        {
            addObject( new Wall("edge2.png"), 787, 15 + 50*i);
        }
        
        for(int i = 0; i < 7; i++)
        {
            addObject( new Wall("edge.png"), 25 + 50*i, 150);
        }
        
                for(int i = 0; i < 8; i++)
        {
            addObject( new Wall("edge.png"), 550 + 50*i, 150);
        }
        
                        for(int i = 0; i < 8; i++)
        {
            addObject( new Wall("edge2.png"), 513, 150 + 50*i);
        }
    }
}
