package Modele;

public class FibonacciModel {
    // Méthode pour calculer la suite de Fibonacci jusqu'à un certain nombre
    public int[] calculerSuiteFibonacci(int nombre) {
        // Vérifier si le nombre de termes est valide
        if (nombre <= 0) {
            throw new IllegalArgumentException("Le nombre doit être un entier positif");
        }
        // Initialiser un tableau pour stocker la suite de Fibonacci
        int[] suiteFibonacci = new int[nombre];
        // Calculer les deux premiers termes de la suite de Fibonacci
        if (nombre >= 1) {
            suiteFibonacci[0] = 0;
        }
        if (nombre >= 2) {
            suiteFibonacci[1] = 1;
        }
        // Calculer les termes suivants de la suite de Fibonacci

        for (int i = 2; i < nombre; i++) {
            suiteFibonacci[i] = suiteFibonacci[i - 1] + suiteFibonacci[i - 2];
        }

        return suiteFibonacci;
    }
}

