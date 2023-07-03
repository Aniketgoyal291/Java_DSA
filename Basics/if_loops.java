import java.util.Scanner;

public class if_loops {

    void fibonacchi(int length) {

        long first = 0;
        long second = 1;
        long intermediate;
        System.out.println(first);
        System.out.println(second);

        for (int i = 0; i < length - 2; i++) {
            intermediate = first + second;
            first = second;
            second = intermediate;
            System.out.println(intermediate);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        if_loops obj = new if_loops();
        obj.fibonacchi(length);

        sc.close();

    }

}