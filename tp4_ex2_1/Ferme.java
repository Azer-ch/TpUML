public class Ferme implements State {
    public PorteDeGarage porte;

    public Ferme(PorteDeGarage porte) {
        this.porte = porte;
    }

    public void ouvrir() {
        System.out.println("La Porte est en cours d'Ouverture !");
        State s = new enCoursOuverture(porte);
        porte.changeState(s);
        // Utilitaire.setTimeout(() -> {
        System.out.println("La porte est ouverte");
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