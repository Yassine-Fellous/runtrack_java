package jour1;

import java.util.Scanner;

public class job11 {
    public static void main(String[] args) {
        Scanner minute = new Scanner(System.in);
        System.out.println("durez en minute : ");
        int min = minute.nextInt();
        int heure = min / 60;
        int mi = min % 60;
        System.out.println(min + " est egale a " + heure + " heure et " + mi + " minute");

    }
}

