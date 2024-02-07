import Controleur.FibonacciControleur;
import Modele.FibonacciModel;
import Vue.FibonacciVue;


public class Main {
    public static void main(String[] args) {
        FibonacciModel modele = new FibonacciModel();
        FibonacciVue vue = new FibonacciVue();
        FibonacciControleur controleur = new FibonacciControleur(modele, vue);

        controleur.traiterSuiteFibonacci();
    }
}