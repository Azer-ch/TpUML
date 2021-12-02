public class PorteDeGarage {
    private State state;
    public void changeState(State s) {
        state = s;
    }
    public void ouvrir(){
        state.ouvrir();
    }
    public void fermer(){
        state.fermer();
    }
}