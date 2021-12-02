public class Main {
    public static void main(String[] args) {
        Visitor v1 = new VisitorAcheterSouvenir();
        Visitor v2 = new VisitorVisiterPourLaPremierFois();
        Ville ville = new Ville();
        Parc parc = new Parc();
        Muse muse = new Muse();
        ville.acceptVisit(v2);
        muse.acceptVisit(v1);
        parc.acceptVisit(v2);
    }
}
