public class Muse extends ZoneTouristique {
    public void acceptVisit(Visitor v) {
        System.out.println("Le muse a accepte votre visite.");
        v.VisitMuse(this);
    }
}
