package jour2;

public class job10 {
    public static void main(String[] args) {
        int nombre= 1234;
        String nombreString = String.valueOf(nombre);
        char f = nombreString.charAt(0);
        char s = nombreString.charAt(1);
        char t = nombreString.charAt(2);
        char l= nombreString.charAt(3);

        int fi = f - 48;
        int si = s - 48;
        int ti = t - 48;
        int li = l - 48;
        int r = fi + si + ti + li;


        System.out.println("addition = " + r);
    }
}
