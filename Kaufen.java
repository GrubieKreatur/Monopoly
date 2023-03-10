import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Kaufen.
 * 
 * @author Leo Gerl, Sven Schober, Jule Dannenberg, Lando Ambrus
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaufen extends Actor
{
    private Spielverwaltung spielverwaltung;
    private BlockDelegate blockDelegate;
    private String dateiname = "kaufen";
    
    public Kaufen(Spielverwaltung spielverwaltung){
        this.spielverwaltung = spielverwaltung;
        this.blockDelegate = new BlockDelegate(this, dateiname);
        block();
    }
    
    /**
     * Act - tut, was auch immer Kaufen tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            spielverwaltung.würfeln();
        }
        updateBild();
    }
    
    private void updateBild(){
        if (istGeblockt()){
            this.setImage("kaufenblock.png");
        }else{
            this.setImage("kaufen.png");
        }
    }
    
    /**
     * Delegiert das Blockieren des kaufen-Knopfes an die Klasse BlockDelegate
     */
    public void block(){
        blockDelegate.block();
    }
    
    /**
     * Delegiert das Entblockieren des Bauuen-Knopfes an die Klasse BlockDelegate
     */
    public void unblock(){
        blockDelegate.unblock();
    }
    
    /**
     * Bestimmt, ob das kaufen-Objekt geblockt ist.
     * @return Geblocktheit des WürfelKnopf-Objektes
     */
    public boolean istGeblockt(){
        return blockDelegate.istGeblockt();
    }
}
