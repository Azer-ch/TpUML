public class enCoursOuverture implements State {
    public PorteDeGarage porte;

    public enCoursOuverture(PorteDeGarage porte) {
        this.porte = porte;
    }

    public void ouvrir() {
        System.out.println("La porte est deja en cours d'ouverture");
    }

    public void fermer() {
        State s = new enCoursFermeture(porte);
        porte.changeState(s);
        // Utilitaire.setTimeout(() -> {
        porte.changeState(new Ferme(porte));
        // }, 500);
    }

    public void setPorte(PorteDeGarage porte) {
        this.porte = porte;
    }
}