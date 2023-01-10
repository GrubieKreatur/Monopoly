import greenfoot.*;
/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Kontostand.
 * 
 * @author Leo Gerl, Sven Schober, Jule Dannenberg, Lando Ambrus
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kontostand extends Actor
{
    // Attribute -  ersetzen Sie das Beispiel hier mit ihren eigenen Attributen
    private Spielverwaltung spielverwaltung;

    /**
     * Konstruktor für Objekte der Klasse Kontostand
     */
    public Kontostand(Spielverwaltung spielverwaltung)
    {
        this.spielverwaltung = spielverwaltung;
    }
    
    public void updateKontostand(int kontostand){
        getImage().drawString(kontostand + " DM",20,50-20);
    }
}