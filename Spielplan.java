import greenfoot.*;
/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Spielplan.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spielplan  
{
    /**
     * Konstruktor für Objekte der Klasse Spielplan
     */
    public Spielplan(MyWorld mw,Würfel wf[],Spielfigur sf[],WürfelKnopf wk,Kontostand ks, Bezahlen bz,Bauen bau,Kaufen kauf,SpielerAnzeige sa,NächsterSpieler ns)
    {
        sf[0].setImage("images/Auto.png");
        mw.addObject(sf[0],58,701);
        sf[1].setImage("images/Schiff.png");
        mw.addObject(sf[1],25,694);
        mw.addObject(wk, 550, 600);
        mw.addObject(wf[0], 330, 550);
        mw.addObject(wf[1], 420, 550);
        mw.addObject(kauf, 200, 500);
        mw.addObject(bau, 200, 550);
        mw.addObject(bz, 200, 600);
        mw.addObject(ns, 550, 550);
        mw.addObject(ks, 375, 450);
        mw.addObject(sa, 550, 500);
    }
}