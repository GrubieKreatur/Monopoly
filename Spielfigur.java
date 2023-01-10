import greenfoot.Actor;
import java.util.concurrent.TimeUnit;

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Spielfigur.
 * 
 * @author Leo Gerl, Sven Schober, Jule Dannenberg, Lando Ambrus
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Spielfigur extends Actor  
{
    private Spielverwaltung spielverwaltung;
    private int aktpos = 0;
    private String name;
    private int kontostand = 30000;
    private int [] [] posArr;
    private int bewegung;
    
    /**
     * Konstruktor für Objekte der Klasse Spielfigur
     */
    public Spielfigur(Spielverwaltung spielverwaltung){
        this.spielverwaltung = spielverwaltung;
        createArray();
    }
    
    public void act() 
    {
        if(bewegung !=0){
            setPos((aktpos +1)%40);
            bewegung = bewegung -1;
        }
    }
    
    public void restBewegung(int anzahl){
        this.bewegung = anzahl;
    }
    
    public int aktpos(){
        return aktpos;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void updateKontostand(int Kontostand){
        this.kontostand = kontostand;
    }
    
    public int getKontostand(){
        return kontostand;
    }
    
    private void createArray(){
        posArr = new int [40] [2];
        posArr [0] [0] = 35;
        posArr [0] [1] = 710;
        posArr [1] [0] = 35;
        posArr [1] [1] = 625;
        posArr [2] [0] = 35;
        posArr [2] [1] = 563;
        posArr [3] [0] = 35;
        posArr [3] [1] = 501;
        posArr [4] [1] = 439;
        posArr [4] [0] = 35;
        posArr [5] [1] = 377;
        posArr [5] [0] = 35;
        posArr [6] [1] = 315;
        posArr [6] [0] = 35;
        posArr [7] [1] = 253;
        posArr [7] [0] = 35;
        posArr [8] [1] = 191;
        posArr [8] [0] = 35;
        posArr [9] [1] = 129;
        posArr [9] [0] = 35;
        posArr [10] [1] = 27;
        posArr [10] [0] = 19;
        posArr [11] [1] = 40;
        posArr [11] [0] = 126;
        posArr [12] [1] = 40;
        posArr [12] [0] = 188;
        posArr [13] [1] = 40;
        posArr [13] [0] = 250;
        posArr [14] [1] = 40;
        posArr [14] [0] = 312;
        posArr [15] [1] = 40;
        posArr [15] [0] = 374;
        posArr [16] [1] = 40;
        posArr [16] [0] = 436;
        posArr [17] [1] = 40;
        posArr [17] [0] = 498;
        posArr [18] [1] = 40;
        posArr [18] [0] = 560;
        posArr [19] [1] = 40;
        posArr [19] [0] = 622;
        posArr [20] [1] = 48;
        posArr [20] [0] = 701;
        posArr [21] [1] = 128;
        posArr [21] [0] = 710;
        posArr [22] [1] = 190;
        posArr [22] [0] = 710;
        posArr [23] [1] = 252;
        posArr [23] [0] = 710;
        posArr [24] [1] = 314;
        posArr [24] [0] = 710;
        posArr [25] [1] = 376;
        posArr [25] [0] = 710;
        posArr [26] [1] = 438;
        posArr [26] [0] = 710;
        posArr [27] [1] = 500;
        posArr [27] [0] = 710;
        posArr [28] [1] = 562;
        posArr [28] [0] = 710;
        posArr [29] [1] = 624;
        posArr [29] [0] = 710;
        posArr [30] [1] = 703;
        posArr [30] [0] = 704;
        posArr [31] [1] = 711;
        posArr [31] [0] = 624;
        posArr [32] [1] = 711;
        posArr [32] [0] = 562;
        posArr [33] [1] = 711;
        posArr [33] [0] = 500;
        posArr [34] [1] = 711;
        posArr [34] [0] = 438;
        posArr [35] [1] = 711;
        posArr [35] [0] = 376;
        posArr [36] [1] = 711;
        posArr [36] [0] = 314;
        posArr [37] [1] = 711;
        posArr [37] [0] = 252;
        posArr [38] [1] = 711;
        posArr [38] [0] = 190;
        posArr [39] [1] = 711;
        posArr [39] [0] = 128;
    }
    public void setPos(int newPos){
        aktpos = newPos;
        setLocation(posArr[aktpos][0],posArr[aktpos][1]);
        }
    public int getPos(){
        return aktpos;
    }
}