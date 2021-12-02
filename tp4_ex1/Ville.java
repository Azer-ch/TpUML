import java.util.*;
public class Ville extends ZoneTouristique {
    ArrayList<ZoneTouristique> zones = new ArrayList<ZoneTouristique>();
    public void acceptVisit(Visitor v) {
        System.out.println("La ville a accepte votre visite.");
        v.VisitVille(this);
        for(ZoneTouristique zone : zones){
            zone.acceptVisit(v);
        }
    }
}