import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse WürfelKnopf.
 * 
 * @author Leo Gerl, Sven Schober, Jule Dannenberg, Lando Ambrus
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WürfelKnopf extends Actor
{
    private Spielverwaltung spielverwaltung;
    private String dateiname = "würfelKnopf";
    private BlockDelegate blockDelegate;
    
    public WürfelKnopf(Spielverwaltung spielverwaltung){
        this.blockDelegate = new BlockDelegate(this,dateiname);
        this.spielverwaltung = spielverwaltung;
        block();
    }
    
    /**
     * Act - tut, was auch immer WürfelKnopf tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            spielverwaltung.clicked(this);
        }
    }
    
    private void updateBild(){
        if (istGeblockt()){
            this.setImage("würfelKnopfblock.png");
        }else{
            this.setImage("würfelKnopf.png");
        }
    }
    
    /**
     * Delegiert das Blockieren des WürfelKnopfes an die Klasse BlockierbarerActorDelegate
     */
    public void block(){
        blockDelegate.block();
    }
    
    /**
     * Delegiert das Entblockieren des WürfelKnopfes an die Klasse BlockierbarerActorDelegate
     */
    public void unblock(){
        blockDelegate.unblock();
    }
    
    /**
     * Bestimmt, ob das WürfelKnopf-Objekt geblockt ist.
     * @return Geblocktheit des WürfelKnopf-Objektes
     */
    public boolean istGeblockt(){
        return blockDelegate.istGeblockt();
    }
}