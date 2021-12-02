public class enCoursFermeture implements State {
    public PorteDeGarage porte;

    public enCoursFermeture(PorteDeGarage porte) {
        this.porte = porte;
    }

    public void ouvrir() {
        System.out.println("La porte changera de en cours de fermeture a en cours d'ouverture");
        State s = new enCoursOuverture(porte);
        porte.changeState(s);
        // Utilitaire.setTimeout(() -> {
        System.out.println("La porte est ouverte");
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