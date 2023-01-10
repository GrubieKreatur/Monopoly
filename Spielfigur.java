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
    
    /**
     * Konstruktor für Objekte der Klasse Spielfigur
     */
    public Spielfigur(Spielverwaltung spielverwaltung){
        this.spielverwaltung = spielverwaltung;
        createArray();
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
        

        /**switch(aktpos){
            case 1:
                setLocation(35,710);
                break;
            case 2:
                setLocation(35,625);
                break;
            case 3:
                setLocation(35,563);
                break;
            case 4:
                setLocation(35,501);
                break;
            case 5:
                setLocation(35,439);
                break;
            case 6:
                setLocation(35,377);
                break;
            case 7:
                setLocation(35,315);
                break;
            case 8:
                setLocation(35,253);
                break;
            case 9:
                setLocation(35,191);
                break;
            case 10:
                setLocation(35,129);
                break;
            case 11:
                setLocation(19,27);
                break;
            case 12:
                setLocation(126,40);
                break;
            case 13:
                setLocation(188,40);
                break;
            case 14:
                setLocation(250,40);
                break;
            case 15:
                setLocation(312,40);
                break;
            case 16:
                setLocation(374,40);
                break;
            case 17:
                setLocation(436,40);
                break;
            case 18:
                setLocation(498,40);
                break;
            case 19:
                setLocation(560,40);
                break;
            case 20:
                setLocation(622,40);
                break;
            case 21:
                setLocation(699,48);
                break;
            case 22:
                setLocation(701,48);
                break;
            case 23:
                setLocation(710,128);
                break;
            case 24:
                setLocation(710,190);
                break;
            case 25:
                setLocation(710,252);
                break;
            case 26:
                setLocation(710,314);
                break;
            case 27:
                setLocation(710,376);
                break;
            case 28:
                setLocation(710,438);
                break;
            case 29:
                setLocation(710,500);
                break;
            case 30:
                setLocation(710,562);
                break;
            case 31:
                setLocation(704,703);
                try
                {
                    TimeUnit.SECONDS.sleep(3);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
                setPos(11);
                break;
            case 32:
                setLocation(624,711);
                break;
            case 33:
                setLocation(562,711);
                break;
            case 34:
                setLocation(500,711);
                break;
            case 35:
                setLocation(438,711);
                break;
            case 36:
                setLocation(376,711);
                break;
            case 37:
                setLocation(314,711);
                break;
            case 38:
                setLocation(252,711);
                break;
            case 39:
                setLocation(190,711);
                break;
            case 40:
                setLocation(130,711);
                break;
        }
        **/
        }
    public int getPos(){
        return aktpos;
    }
}