package jour2;

public class job6 {
    public static void main(String[] args) {
        int i = 0;
        int r = 0;
        while ( i <= 100){
            if (i % 2 == 0) {
                r = r+i;

            }
            i +=1;
        }
        System.out.println(r);
    }
}
