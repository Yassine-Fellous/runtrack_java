public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 = 5; int num2 = 10;
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        int numreplace = num2;
        num2 = num1;
        num1 = numreplace;
        System.out.println("num1 = " + num1 + " num2 = " + num2);
    }
}
