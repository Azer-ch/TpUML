public class Afficheur implements Observateur {

    public void update(State s){
        if(s instanceof Ouvert){
            System.out.println("Ouvert");
        }
        else if(s instanceof Ferme){
            System.out.println("Ferme");
        }
        else if(s instanceof enCoursFermeture){
            System.out.println("en Cours de Fermeture");
        }
        else    System.out.println("en Cours d'Ouverture");
        
    }
}
