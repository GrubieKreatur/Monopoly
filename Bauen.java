import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Bauen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bauen extends Actor
{
    private Bank bank;
    private BlockDelegate blockDelegate;
    private String dateiname = "bauen";
    
    public Bauen(Bank bank){
        this.bank = bank;
        this.blockDelegate = new BlockDelegate(this, dateiname);
        block();
    }
    
    /**
     * Act - tut, was auch immer Bauen tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            bank.würfeln();
        }
        updateBild();
    }
    
    private void updateBild(){
        if (istGeblockt()){
            this.setImage("bauenblock.png");
        }else{
            this.setImage("bauen.png");
        }
    }
    
    /**
     * Delegiert das Blockieren des Bauen-Knopfes an die Klasse BlockDelegate
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
     * Bestimmt, ob das Bauen-Objekt geblockt ist.
     * @return Geblocktheit des WürfelKnopf-Objektes
     */
    public boolean istGeblockt(){
        return blockDelegate.istGeblockt();
    }
}
