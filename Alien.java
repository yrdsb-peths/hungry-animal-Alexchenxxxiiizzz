import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor {
    // Constructor for Alien. You can set an image here if you like.
    public Alien() {
        GreenfootImage img = new GreenfootImage("alien_image.png");
        img.scale(40, 40);
        setImage(img);
    }

    // Act method - called with each frame to move the alien down.
    public void act() {
        // Alien falling logic
        setLocation(getX(), getY() + 2); // Move the alien down each frame

        // Check if the alien has reached the bottom of the screen
        if (getY() > getWorld().getHeight() - getImage().getHeight()) {
            // It's missed, remove it and update the missed count
            ((MyWorld)getWorld()).alienMissed();
            getWorld().removeObject(this);
        }
    }
}
