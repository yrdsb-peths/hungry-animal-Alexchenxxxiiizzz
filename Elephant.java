import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * The Elephant class allows the elephant to move around with arrow keys in the Greenfoot world.
 * It can be further extended to interact with other objects like apples.
 * 
 * @author Alex Chen
 * @version 1.0
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
    }

    /**
     * Move the elephant based on key presses.
     */
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(1);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(1);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(1);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(1);
        }
    }
}
