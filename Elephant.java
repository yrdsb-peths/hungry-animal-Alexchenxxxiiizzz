import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor {
    // Constructor for Elephant. You can set an image here if you like.
    public Elephant() {
        // setImage("elephant.png"); // Uncomment and use the correct image file name
    }

    // Act method - called with each frame to handle user input and collect apples.
    public void act() {
        // Elephant movement
        if (Greenfoot.isKeyDown("left")) {
            move(-7); // Move left
        }
        if (Greenfoot.isKeyDown("right")) {
            move(7); // Move right
        }
        
        // Collecting apples
        if (isTouching(Apple.class)) {
            removeTouching(Apple.class);
            // Update the score
            ((MyWorld)getWorld()).increaseScore();
        }
    }
}
