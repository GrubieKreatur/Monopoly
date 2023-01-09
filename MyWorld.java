import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse MyWorld.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class MyWorld extends World
{

    /**
     * Konstruktor für Objekte der Klasse MyWorld
     * 
     */
    public MyWorld()
    {
        // Erstellt eine neue Welt mit 600x400 Zellen und einer Zell-Größe von 1x1 Pixeln.
        super(1220, 750, 1);
        setBackground("images/Spielplan Monopoly.png");
        prepare();
    }

    /**
     * Bereite die Welt für den Programmstart vor.
     * Das heißt: Erzeuge die Anfangs-Objekte und füge sie der Welt hinzu.
     */
    private void prepare()
    {
        new Bank(this);
    }
}