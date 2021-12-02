public class enCoursFermeture implements State {
    public PorteDeGarage porte;

    public enCoursFermeture(PorteDeGarage porte) {
        this.porte = porte;
    }

    public void ouvrir() {
        State s = new enCoursOuverture(porte);
        porte.changeState(s);
        // Utilitaire.setTimeout(() -> {
        porte.changeState(new Ouvert(porte));
        // }, 500);
    }

    public void fermer() {
        System.out.println("La Porte est deja en cours de fermeture !");
    }

    public void setPorte(PorteDeGarage porte) {
        this.porte = porte;
    }
}