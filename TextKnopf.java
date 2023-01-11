import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextKnopf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextKnopf extends Text
{
    /**
     * Act - do whatever the TextKnopf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }

    public TextKnopf(){

    }

    public void setScale(int newwidth, int newheight){
        super.height = newheight;
        super.width = newwidth;
        super.loeschen();
        super.getImage().setColor(new Color(255,0,255));
        super.getImage().fill();
        super.getImage().setColor(new Color(255,255,255));
        getImage().scale(width*2,height*2);
        setNewText(super.text);
    }
    
    public void setBackground(){
        super.getImage().setColor(new Color(255,0,255));
        super.getImage().fill();
    }
}
