package jour2;

import java.util.Scanner;

public class job11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hauteur: ");
        int hauteur = scanner.nextInt();

        construireTriangle(hauteur);
    }

    public static void construireTriangle(int hauteur) {
        for (int i = 1; i <= hauteur; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

