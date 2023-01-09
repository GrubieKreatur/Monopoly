import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Wechselt zum nächsten Benutzer.
 * 
 * @author 
 * @version 
 */
public class NächsterSpieler extends Actor implements BlockTyp
{
    private Spielverwaltung spielverwaltung;
    private BlockDelegate blockDelegate;
    private String dateiname = "nächsterSpielerKnopf";
    private boolean spielBegonnen = false;
    
    /**
     * Konstruktor für Objekte der Klasse NächsterSpieler
     */
    public NächsterSpieler(Spielverwaltung spielverwaltung){
        this.spielverwaltung = spielverwaltung;
        blockDelegate = new BlockDelegate(this,dateiname);
        block();
    }
    
    /**
     * Benachrichtigt die Spielverwaltung darüber, ob ein das NächsterSpieler-Objekt angeklickt wurde
     */
    public void act() 
    {
        if(!spielBegonnen){   
            spielverwaltung.frageNachSpielernamen();
            spielBegonnen = true;
            spielverwaltung.updateSpieler();
        }
        
        if (Greenfoot.mouseClicked(this)&&!istGeblockt()) {
            spielverwaltung.clicked(this);
        }  
    }
    
    /**
     * Delegiert das Blockieren des NächsterSpieler-Knopfes an die Klasse BlockDelegate
     */
    public void block(){
        blockDelegate.block();
    }
    
    /**
     * Delegiert das Entblockieren des NächsterSpieler-Knopfes an die Klasse BlockDelegate
     */
    public void unblock(){
        blockDelegate.unblock();
    }

    /**
     * Bestimmt, ob das NächsterSpieler-Objekt geblockt ist.
     * @return Geblocktheit des NächsterSpieler-Knopfes
     */
    public boolean istGeblockt(){
        return blockDelegate.istGeblockt();
    }
}