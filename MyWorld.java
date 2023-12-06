import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    private int score = 0; // The player's score
    private int applesMissed = 0; // The count of apples missed by the player

    // Constructor for MyWorld. It sets up the initial game state.
    public MyWorld() {    
        super(600, 400, 1); // Create a new world with 600x400 cells, each cell being 1x1 pixels
        prepare();
    }
    
    // Prepare the world by adding initial objects.
    private void prepare() {
        Elephant elephant = new Elephant();
        addObject(elephant, getWidth() / 2, getHeight() - elephant.getImage().getHeight() / 2);
    }

    // The act method is called repeatedly to refresh the game state.
    public void act() {
        if (Greenfoot.getRandomNumber(100) < 2) { // There's a 2% chance to add a new apple each act cycle
            addObject(new Apple(), Greenfoot.getRandomNumber(getWidth()), 0); // Add an apple at a random x-coordinate at the top of the world
        }

        // Use showText to display the score and missed apples count
        showText("Score: " + score + " | Missed: " + applesMissed, 300, 20);

        // Check for win and lose conditions
        if (score >= 66) { // Winning condition
            showEndMessage("You Win!");
            Greenfoot.stop();
        } else if (applesMissed >= 6) { // Losing condition
            showEndMessage("Game Over!");
            Greenfoot.stop();
        }
    }

    // Method to increment the score
    public void increaseScore() {
        score++;
    }

    // Method to increment the count of missed apples
    public void appleMissed() {
        applesMissed++;
    }

    // Method to display the end game message
    private void showEndMessage(String message) {
        showText(message, getWidth() / 2, getHeight() / 2);
    }
}
