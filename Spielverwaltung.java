import greenfoot.*;
import java.util.concurrent.TimeUnit;

/**
 * Write a description of class Spielverwaltung here.
 * 
 * @author Leo Gerl, Sven Schober, Jule Dannenberg, Lando Ambrus
 * @version 2023-01-10
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

            for (int i = 0; i<getAugenzahl();i++) {
                int newPos;
                newPos = currentSpieler.getPos() + 1;
                if (newPos > 39) {
                    newPos = newPos - 40;
                }
                currentSpieler.setPos(newPos);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
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
