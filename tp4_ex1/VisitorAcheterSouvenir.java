public class VisitorAcheterSouvenir implements Visitor {
    public void VisitVille(Ville v){
        System.out.println("J’achète un souvenir du ville !");
    }   
    public void VisitParc(Parc p){
        System.out.println("J’achète un souvenir du Parc !");
    }   
    public void VisitMuse(Muse m){
        System.out.println("J’achète un souvenir du Muse !");
    }   
}
