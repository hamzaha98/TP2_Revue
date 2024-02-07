package Controleur;

import Modele.FibonacciModel;
import Vue.FibonacciVue;

public class FibonacciControleur {
    private FibonacciModel modele;
    private FibonacciVue vue;

    public FibonacciControleur(FibonacciModel modele, FibonacciVue vue) {
        this.modele = modele;
        this.vue = vue;
    }
    // Méthode pour traiter la suite de Fibonacci
    public void traiterSuiteFibonacci() {
        long heureDebut = System.nanoTime();
        int nombre = vue.obtenirNombre();
        int[] suiteFibonacci = null;
        try {
            suiteFibonacci = modele.calculerSuiteFibonacci(nombre);
        } catch (IllegalArgumentException e) {
            // Gérer l'exception si le nombre de termes est invalide
            System.out.println(e.getMessage());
            return;
        }
        long heureDeFin = System.nanoTime();
        // Afficher la suite de Fibonacci et le temps de traitement
        vue.afficherSuiteFibonacci(suiteFibonacci);
        vue.afficherTempsDeTraitement((heureDeFin - heureDebut) / 1000000); // Convertir en millisecondes
    }
}

