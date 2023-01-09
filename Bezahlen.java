import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Bezahlen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bezahlen extends Actor
{
    private Spielverwaltung spielverwaltung;
    private BlockDelegate blockDelegate;
    private String dateiname = "bezahlen";
    
    public Bezahlen(Spielverwaltung spielverwaltung){
        this.spielverwaltung = spielverwaltung;
        this.blockDelegate = new BlockDelegate(this, dateiname);
        block();
    }
    
    /**
     * Act - tut, was auch immer Bezahlen tun will. Diese Methode wird aufgerufen, 
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
            this.setImage("bezahlenblock.png");
        }else{
            this.setImage("bezahlen.png");
        }
    }
    
    /**
     * Delegiert das Blockieren des bezahlen-Knopfes an die Klasse BlockDelegate
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
     * Bestimmt, ob das bezahlen-Objekt geblockt ist.
     * @return Geblocktheit des WürfelKnopf-Objektes
     */
    public boolean istGeblockt(){
        return blockDelegate.istGeblockt();
    }
}
