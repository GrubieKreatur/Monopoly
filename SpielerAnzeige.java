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
    private Bank bank;

    /**
     * Konstruktor für Objekte der Klasse SpielerAnzeige
     */
    public SpielerAnzeige(Bank bank)
    {
        this.bank = bank;
    }
    
    public void updateSpieler(String name){
        getImage().drawString(name,20,50-20);
    }
}