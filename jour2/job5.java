package jour2;

import java.util.Scanner;

public class job5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'age : ");
        int age = scanner.nextInt();
        if(age < 16){
            System.out.println("ne peut pas taffer");
        } if(age >= 55 & age < 67){
            System.out.println("aura du mal a trouver un emploi");
        } if(age >= 67){
            System.out.println("c'est la retraite");
        }

    }
}
