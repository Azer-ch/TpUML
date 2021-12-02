public class Ferme implements State {
    public PorteDeGarage porte;

    public Ferme(PorteDeGarage porte) {
        this.porte = porte;
    }

    public void ouvrir() {
        State s = new enCoursOuverture(porte);
        porte.changeState(s);
        // Utilitaire.setTimeout(() -> {
        porte.changeState(new Ouvert(porte));
        // }, 1000);
    }

    public void fermer() {
        System.out.println("La Porte est deja fermee !");
    }

    public void setPorte(PorteDeGarage porte) {
        this.porte = porte;
    }
}