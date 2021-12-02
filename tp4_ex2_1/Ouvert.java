public class Ouvert implements State {
    public PorteDeGarage porte;

    public Ouvert(PorteDeGarage porte) {
        this.porte = porte;
    }

    public void ouvrir() {
        System.out.println("La Porte est deja ouverte !");
    }

    public void fermer() {
        System.out.println("La Porte est en cours de fermeture !");
        State s = new enCoursFermeture(porte);
        porte.changeState(s);
        // Utilitaire.setTimeout(() -> {
        System.out.println("La porte est fermee");
        porte.changeState(new Ferme(porte));
        // }, 1000);
    }

    public void setPorte(PorteDeGarage porte) {
        this.porte = porte;
    }
}