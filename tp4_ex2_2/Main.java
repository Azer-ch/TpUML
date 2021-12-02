public class Main {
    public static void main(String[] args) {
        PorteDeGarage porte = new PorteDeGarage();
        Afficheur afficheur = new Afficheur();
        State state = new Ferme(porte);
        porte.addAfficheur(afficheur);
        porte.changeState(state);
        porte.ouvrir();
        porte.fermer();
    }
}
