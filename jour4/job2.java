package jour4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class job2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // Temps de départ de l'exécution du programme

        File f = new File("/home/ken/IdeaProjects/runtra/src/jour4/text.txt");

        try {
            boolean created = f.createNewFile();
            if (created) {
                System.out.println("Le fichier a été créé avec succès.");
            } else {
                System.out.println("Le fichier existe déjà.");
            }
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la création du fichier : " + e.getMessage());
        }

        Random rand = new Random();
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre : ");
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            char a = (char) (rand.nextInt(26) + 97);
            str += a;
            System.out.print(a);
            try {
                FileWriter writer = new FileWriter(f, true); // Utilisation du FileWriter en mode append (ajout à la fin du fichier)
                writer.write(a);
                writer.close();
            } catch (IOException e) {
                System.out.println("Une erreur s'est produite lors de l'écriture dans le fichier : " + e.getMessage());
            }
        }

        long endTime = System.currentTimeMillis(); // Temps d'arrêt de l'exécution du programme
        long executionTime = endTime - startTime; // Calcul du temps d'exécution en millisecondes
        System.out.println("    Temps d'exécution total du programme : " + executionTime + " millisecondes");
    }
}