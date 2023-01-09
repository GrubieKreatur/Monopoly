import greenfoot.*;
/**
 * Write a description of class Spielverwaltung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spielverwaltung  
{
    // instance variables - replace the example below with your own
    private Würfel wf[];
    private Spielfigur sf[];
    private WürfelKnopf wk;
    private MyWorld mw;
    private Spielplan sp;
    private Kontostand ks;
    private Bezahlen bz;
    private Bauen bau;
    private Kaufen kauf;
    private SpielerAnzeige sa;
    private NächsterSpieler ns;
    private Spielfigur currentSpieler;

    /**
     * Constructor for objects of class Spielverwaltung
     */
    public Spielverwaltung(MyWorld mw)
    {
        this.mw = mw;
        wf = new Würfel[2];
        for(int i=0;i<wf.length;i++){
            wf[i] = new Würfel();
        }
        sf = new Spielfigur[2];
        for(int i=0;i<sf.length;i++){
            sf[i] = new Spielfigur(this);
        }
        wk = new WürfelKnopf(this);
        ks = new Kontostand(this);
        bz = new Bezahlen(this);
        bau = new Bauen(this);
        kauf = new Kaufen(this);
        sa = new SpielerAnzeige(this);
        ns = new NächsterSpieler(this);
        sp = new Spielplan(mw,wf,sf,wk,ks,bz,bau,kauf,sa,ns);
    }

    public void frageNachSpielernamen(){
        for(int i=0;i<sf.length;i++){
            sf[i].setName(Greenfoot.ask("Gib den Namen des ersten Spielers ein!"));
        }
        currentSpieler = sf[0];
        wk.unblock();
        ks.updateKontostand(sf[0].getKontostand());
    }
    
    /**
     * Prüft, ob ein Objekt angeklickt wurde und ruft die entsprechende Methode auf
     */
    public void clicked(Object obj){
        if (obj==wk) {
            würfeln();
            //wk.block();
            currentSpieler.setPos(currentSpieler.getPos() + getAugenzahl());
            if(currentSpieler.getPos()>40){
                currentSpieler.setPos(currentSpieler.getPos()-40);
            }
        }
    }

    public void würfeln(){
        if (!wk.istGeblockt()){
            for(int i=0;i<wf.length;i++){
                wf[i].würfeln();
            }
        }
    }
    
    public void updateSpieler(){
        sa.updateSpieler(currentSpieler.getName());
    }
    
    public int getAugenzahl(){
        return wf[0].getAugenzahl() + wf[1].getAugenzahl();
    }
}
