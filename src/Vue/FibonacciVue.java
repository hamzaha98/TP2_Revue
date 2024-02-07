package Vue;

import java.util.Scanner;

public class FibonacciVue {
    // Méthode pour obtenir un nombre de la suite de Fibonacci à calculer à partir de l'utilisateur
    public int obtenirNombre() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean saisie = false;
        do {
            try {
                System.out.print("Entrez le nombre de la suite de Fibonacci à calculer : ");
                nombre = scanner.nextInt();
                saisie = true;
            } catch (Exception e) {
                System.out.println("Saisie invalide. Veuillez entrer un entier valide.");
                scanner.nextLine(); // Effacer le tampon d'entrée
            }
        } while (!saisie);


        return nombre;
    }


    // Méthode pour afficher la suite de Fibonacci
    public void afficherSuiteFibonacci(int[] suite) {
        System.out.println("Suite de Fibonacci :");
        for (int terme : suite) {
            System.out.print(terme + " ");
        }
        System.out.println();
    }
    // Méthode pour afficher le temps de traitement
    public void afficherTempsDeTraitement(long duree) {
        System.out.println("Durée du traitement : " + duree + " millisecondes");
    }
}

