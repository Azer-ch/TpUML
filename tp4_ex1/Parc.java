public class Parc extends ZoneTouristique {
    public void acceptVisit(Visitor v) {
        System.out.println("Le parc a accepte votre visite.");
        v.VisitParc(this);
    }
}
