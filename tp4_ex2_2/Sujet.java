import java.util.*;
public class Sujet {
    private ArrayList<Afficheur> afficheurs = new ArrayList<>();
    public void notifyAfficheur(State s) {
        for (var aff : afficheurs) {
            aff.update(s);
        }
    }
    public void addAfficheur(Afficheur a) {
        afficheurs.add(a);
    }
    public void deleteAfficheur(Afficheur a){
        afficheurs.remove(a);
    }
}

