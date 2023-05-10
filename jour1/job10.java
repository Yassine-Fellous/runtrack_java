package jour1;

import java.util.Scanner;

public class job10{
    public static void main(String[] args) {
        Scanner prenom = new Scanner(System.in);
        System.out.println("tapez votre prenom : ");
        Scanner nom = new Scanner(System.in);
        System.out.println("tapez votre nom : ");
        String cmpl = prenom.nextLine() + nom.nextLine();
        System.out.println(cmpl);
    }
}

