import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    private GreenfootImage bild; 
    private String text ="None";
    public Text()
    {
        bild = getImage();
    }

    public void Position(int x,int y )
    {
        setLocation(x,y);
    }
    public void anzeigen(String pText)
    {
        loeschen();
        getImage().drawImage(new GreenfootImage(pText, 25, Color.BLACK, new Color(0, 0, 0, 0)),10,10);

    }

    public void loeschen()
    {
        getImage().clear();
    }
}
