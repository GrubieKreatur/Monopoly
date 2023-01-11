import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Text extends Actor {
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }

    public String text = "None";
    public int height = 10;
    public int width = 30;

    public Text() {
        loeschen();
        getImage().scale(width * 2, height * 2);
        getImage().drawString​(text, width, height);
    }

    public Text(String ptext) {
        text = ptext;
        loeschen();
        getImage().scale(width * 2, height * 2);
        getImage().drawString​(text, width, height);

    }

    /**
     * Ändert die Masse vom Bild
     * 
     * @param width
     * @param height
     */
    public void setScale(int newwidth, int newheight) {
        height = newheight;
        width = newwidth;
        loeschen();
        getImage().scale(width * 2, height * 2);
        setNewText(text);
    }

    public void setNewText(String ptext) {
        text = ptext;
        getImage().drawString​(text, width, height);
    }

    public void setAllNew(String ptext, int newwidth, int newheight) {

        width = newwidth;
        height = newheight;
        loeschen();
        getImage().scale(width * 2, height * 2);
        getImage().drawString​(text, width, height);
        text = ptext;
        setNewText(text);

    }

    public void Position(int x, int y) {
        setLocation(x, y);
    }

    public void loeschen() {
        getImage().clear();
    }
}
