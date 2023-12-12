import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor {
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] idle = new GreenfootImage[2];

    // Constructor for Spaceship. You can set an image here if you like.
    public Spaceship() {
        for (int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/tile00" + i + ".png");
            idle[i].scale(100, 100);
        }
        animationTimer.mark();
        setImage(idle[0]);
    }
    /**
     * Animate the spaceship
     */
    int imageIndex = 0;
    public void animateSpaceship()
    {
        if (animationTimer.millisElapsed() < 500)
        {
            return;
        }
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
        animationTimer.mark();
    }
    // Act method - called with each frame to handle user input and collect aliens.
    public void act() {
        // Spaceship movement
        if (Greenfoot.isKeyDown("left")) {
            move(-7); // Move left
        }
        if (Greenfoot.isKeyDown("right")) {
            move(7); // Move right
        }

        // Collecting aliens
        if (isTouching(Alien.class)) {
            removeTouching(Alien.class);
            // Update the score
            ((MyWorld)getWorld()).increaseScore();
        }
        animateSpaceship();
    }
}
