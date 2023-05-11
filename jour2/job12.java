package jour2;

public class job12 {
    public static void main(String[] args) {
        int[] faces = {1, 2, 3, 4, 5, 6};
        int totalCombinaisons = 0;

        // Générer toutes les combinaisons possibles
        for (int face1 : faces) {
            for (int face2 : faces) {
                for (int face3 : faces) {
                    System.out.println(face1 + " " + face2 + " " + face3);
                    totalCombinaisons++;
                }
            }
        }

        System.out.println("combinaisons: " + totalCombinaisons);
    }
}
