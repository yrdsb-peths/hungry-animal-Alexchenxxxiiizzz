import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The space class is the world where the game takes place.
 * Apples will fall from the top of the screen and the player will control the elephant to catch them.
 * 
 * @author Your Name
 * @version 1.0
 */
public class space extends World
{
    private Elephant elephant; // Declare the elephant

    /**
     * Constructor for objects of class space.
     */
    public space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        elephant = new Elephant();
        addObject(elephant, getWidth() / 2, getHeight() - elephant.getImage().getHeight() / 2);
    }

    public void act()
    {
        // Spawn an apple at random intervals.
        if(Greenfoot.getRandomNumber(100) < 1) { // You can adjust this number for frequency of apples
            int x = Greenfoot.getRandomNumber(getWidth());
            addObject(new Apple(), x, 0); // Spawn apple at the top of the screen
        }
    }
}
