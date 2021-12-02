public class Main {
    public static void main(String [] args){
        PorteDeGarage porte = new PorteDeGarage();
        State state = new Ferme(porte);
        porte.changeState(state);
        porte.ouvrir();
        porte.fermer();
    }
}
