package jour1;
import java.util.Scanner;

public class job13 {
    public static void main(String[] args) {
        Scanner nbr = new Scanner(System.in);
        System.out.println("nb entier : ");
        int nb = nbr.nextInt();
        int n = 0;

        while(nb > n){
            n +=1;
            System.out.println(n);
        }
    }
}
