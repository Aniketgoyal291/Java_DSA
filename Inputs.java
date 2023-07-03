import java.util.Scanner;

class Inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        float sum = num1 + num2;
        System.out.println(sum);

        sc.close();

        // will trim all the spaces at the start of a String.
        String str = "     Aniket goyal is my name";
        System.out.println(str.trim());

    }
}