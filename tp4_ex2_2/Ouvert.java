public class Ouvert implements State {
    public PorteDeGarage porte;

    public Ouvert(PorteDeGarage porte) {
        this.porte = porte;
    }

    public void ouvrir() {
        System.out.println("La Porte est deja ouverte !");
    }

    public void fermer() {
        State s = new enCoursFermeture(porte);
        porte.changeState(s);
        // Utilitaire.setTimeout(() -> {
        porte.changeState(new Ferme(porte));
        // }, 1000);
    }

    public void setPorte(PorteDeGarage porte) {
        this.porte = porte;
    }
}