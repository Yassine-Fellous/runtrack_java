package jour1;

import java.util.Scanner;

public class job12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("str1: ");
        String str1 = scanner.nextLine();

        System.out.print("str2: ");
        String str2 = scanner.nextLine();

        System.out.println(str1 + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println(str1 + str2);
    }
}
