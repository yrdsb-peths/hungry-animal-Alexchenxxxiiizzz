import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    private int score = 0; // The player's score
    private int aliensMissed = 0; // The count of aliens missed by the player

    // Constructor for MyWorld. It sets up the initial game state.
    public MyWorld() {    
        super(600, 400, 1); // Create a new world with 600x400 cells, each cell being 1x1 pixels
        prepare();
    }

    // Prepare the world by adding initial objects.
    private void prepare() {
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, getWidth() / 2, getHeight() - spaceship.getImage().getHeight() / 2);
    }

    // The act method is called repeatedly to refresh the game state.
    public void act() {
        if (Greenfoot.getRandomNumber(100) < 2) { // There's a 2% chance to add a new alien each act cycle
            addObject(new Alien(), Greenfoot.getRandomNumber(getWidth()), 0); // Add an alien at a random x-coordinate at the top of the world
        }

        // Use showText to display the score and missed aliens count
        showText("Score: " + score + " | Missed: " + aliensMissed, 300, 20);

        // Check for win and lose conditions
        if (score >= 66) { // Winning condition
            showEndMessage("You Win!");
            Greenfoot.stop();
        } else if (aliensMissed >= 6) { // Losing condition
            showEndMessage("Game Over!");
            Greenfoot.stop();
        }
    }

    // Method to increment the score
    public void increaseScore() {
        score++;
    }

    // Method to increment the count of missed aliens
    public void alienMissed() {
        aliensMissed++;
    }

    // Method to display the end game message
    private void showEndMessage(String message) {
        showText(message, getWidth() / 2, getHeight() / 2);
    }
}
