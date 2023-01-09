import greenfoot.*;
/**
 * Gemeinsamer Datentyp aller Delegatoren und Delegierten für einen blockierbaren Actor.
 * 
 * @author 
 * @version 
 */
public interface BlockTyp  
{
    public void block();
    public void unblock();
    public boolean istGeblockt();
}