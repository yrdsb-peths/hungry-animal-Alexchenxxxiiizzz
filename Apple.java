import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor {
    // Constructor for Apple. You can set an image here if you like.
    public Apple() {
        // setImage("apple.png"); // Uncomment and use the correct image file name
    }

    // Act method - called with each frame to move the apple down.
    public void act() {
        // Apple falling logic
        setLocation(getX(), getY() + 2); // Move the apple down each frame
        
        // Check if the apple has reached the bottom of the screen
        if (getY() > getWorld().getHeight() - getImage().getHeight()) {
            // It's missed, remove it and update the missed count
            ((MyWorld)getWorld()).appleMissed();
            getWorld().removeObject(this);
        }
    }
}
