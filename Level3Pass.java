import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3Pass here.
 * 
 * @ Patrick Hu 
 * @version (a version number or a date)
 */
public class Level3Pass extends LevelPassWorld
{
    public Level3Pass()
    {
        super(800, 600, 1);
        Label l = new Label("You Passed Level 3!", 40);
        addObject(l, getWidth() / 2, getHeight() / 2);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld(new Level4());
        }
    }
}