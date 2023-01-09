import greenfoot.*;
/**
 * Die Klasse BlockierbarerActorDelegate übernimmt die Aufgabe des Blockierens eines Knopfs.
 * Der Knopf selbst ist der Delegator.
 * 
 * @author 
 * @version 
 */
public class BlockDelegate implements BlockTyp
{
    private String dateiname;
    private String blockname = "block";
    private String png = ".png";
    private boolean istGeblockt;
    Actor knopfDelegator;
    /*
     * Konstruktor für Objekte der Klasse BlockierbarerActorDelegate
     */
    public BlockDelegate(Actor a, String dn){
        knopfDelegator = a;
        dateiname = dn;
    }
    
    private void updateBild(){
        String zusatz = "";
        if (istGeblockt) zusatz = blockname;
        String file = dateiname+zusatz+png;
        knopfDelegator.setImage(file);
    }
    
    /**
     * Blockiert Knöpfe
     */
    public void block(){
        istGeblockt = true;
        this.updateBild();
    }
    
    /**
     * Entblockt Knöpfe
     */
    public void unblock(){
        istGeblockt = false;  
        this.updateBild();
    }
    
    /**
     * Bestimmt, ob ein Objekt geblockt ist.
     * @return Geblocktheit eines Objektes.
     */
    public boolean istGeblockt(){
        return istGeblockt;
    }
}