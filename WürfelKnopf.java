import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse WürfelKnopf.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WürfelKnopf extends Actor
{
    private Bank bank;
    private String dateiname = "würfelKnopf";
    private BlockDelegate blockDelegate;
    
    public WürfelKnopf(Bank bank){
        this.blockDelegate = new BlockDelegate(this,dateiname);
        this.bank = bank;
        block();
    }
    
    /**
     * Act - tut, was auch immer WürfelKnopf tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            bank.clicked(this);
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