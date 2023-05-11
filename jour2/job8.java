package jour2;

import java.util.Scanner;

public class job8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un numero: ");
        int r = scanner.nextInt();
        int i=1;
        while(r >= 9){
            r = r/10;
            i ++;
        }
        System.out.print(i);



    }
}
