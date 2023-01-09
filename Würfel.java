import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Würfel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Würfel extends Actor
{
    private int augenzahl = 1;
    private String dateiname = "würfel";
    private Bank bank;
    
    /**
     * Act - tut, was auch immer Würfel tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        
    }
    
    /**
     * Würfelt die nicht-blockierten Wüfelobjekte
     */
    public void würfeln(){
        // wähle eine Zufallszahl zwischen 1 und 6 und speichere sie in augenzahl
        augenzahl = Greenfoot.getRandomNumber(6)+1;
        updateBild();
    }
    
    /**
     * Bestimmt den Wert des Würfelobjekts
     * @return Wert des Würfelobjekts
     */
    public int getAugenzahl(){
        return augenzahl;
    }
    
    private void updateBild(){
        this.setImage(dateiname+augenzahl+".png");
    }
}