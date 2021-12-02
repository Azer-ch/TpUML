public class VisitorVisiterPourLaPremierFois implements Visitor{
    public void VisitVille(Ville m) {
        System.out.println("Je visite pour la première fois la ville !");
    }

    public void VisitParc(Parc v) {
        System.out.println("Je visite pour la première fois le Parc !");
    }

    public void VisitMuse(Muse p) {
        System.out.println("Je visite pour la première fois le Muse !");
    }
}
