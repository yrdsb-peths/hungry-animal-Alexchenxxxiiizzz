import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * The Apple class represents apples that fall from the top of the screen.
 * 
 * @author Your Name
 * @version 1.0
 */
public class Apple extends Actor
{
    private int fallSpeed = 2; // The speed at which the apple falls

    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall();
    }
    
    /**
     * Simulate falling by moving the apple down the screen.
     */
    private void fall()
    {
        setLocation(getX(), getY() + fallSpeed);
        if (getY() > getWorld().getHeight()) {
            getWorld().removeObject(this);
        }
    }
}
