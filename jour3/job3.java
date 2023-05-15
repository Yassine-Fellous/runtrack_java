package jour3;

import java.util.Arrays;

public class job3 {
    public static void main(String[] args) {
        String []mystring = {"Josette", "John", "Myrtille","Marc"};
        System.out.println(mystring[1]);
        mystring[2] = "Mireille";
        System.out.println(Arrays.toString(mystring));
    }
}
