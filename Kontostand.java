import greenfoot.*;
/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Kontostand.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kontostand extends Actor
{
    // Attribute -  ersetzen Sie das Beispiel hier mit ihren eigenen Attributen
    private Bank bank;

    /**
     * Konstruktor für Objekte der Klasse Kontostand
     */
    public Kontostand(Bank bank)
    {
        this.bank = bank;
    }
    
    public void updateKontostand(int kontostand){
        getImage().drawString(kontostand + " DM",20,50-20);
    }
}