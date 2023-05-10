public class Facture {
    public static void main(String[] args) {
        float prix  = 49.99F; int quant = 3;
        float tva = 0.2F;
        float prixhtc = quant * prix;
        System.out.println(prixhtc);
        float taxe = prixhtc * tva;
        System.out.println(taxe);
        float prixttc = prixhtc + taxe;
        System.out.println(prixttc);

    }

}
