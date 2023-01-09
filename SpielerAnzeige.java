import greenfoot.*;
/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse SpielerAnzeige.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SpielerAnzeige extends Actor
{
    // Attribute -  ersetzen Sie das Beispiel hier mit ihren eigenen Attributen
    private Spielverwaltung spielverwaltung;

    /**
     * Konstruktor für Objekte der Klasse SpielerAnzeige
     */
    public SpielerAnzeige(Spielverwaltung spielverwaltung)
    {
        this.spielverwaltung = spielverwaltung;
    }
    
    public void updateSpieler(String name){
        getImage().drawString(name,20,50-20);
    }
}