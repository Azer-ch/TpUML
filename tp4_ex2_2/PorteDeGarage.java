public class PorteDeGarage extends Sujet {
    private State state;

    public State getState() {
        return this.state;
    }

    public void changeState(State s) {
        state = s;
        notifyAfficheur(s);
    }

    public void ouvrir() {
        state.ouvrir();
    }

    public void fermer() {
        state.fermer();
    }

    }

