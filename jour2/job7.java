package jour2;

import java.util.Scanner;

public class job7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez l'age : ");
        int r = scanner.nextInt();
        int i = r - 1;
        int b = r;

        while (i >= 1) {
            b = b * i;
            i--;
        }

        System.out.println(b);
    }
}
