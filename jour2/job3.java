package jour2;
import java.util.Scanner;

public class job3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le premier nombre : ");
        int nb = scanner.nextInt();
        int i = 0;
        while (i <= 10){

            int r = nb*i;
            System.out.println( nb + " x " + i + "=" + r);
            i +=1;
        }
    }
}
