import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author Leo Gerl, Sven Schober, Jule Dannenberg, Lando Ambrus
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepear();
    }
    
    public void prepear(){
        Ueberschrift ueberschrift = new Ueberschrift();
        this.addObject(ueberschrift, 450 , 100);
        
        Datenschutz datenschutz = new Datenschutz();
        this.addObject (datenschutz, 350,550);
    }
}
