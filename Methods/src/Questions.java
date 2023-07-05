import java.util.Scanner;
public class Questions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isArmstrongNumber(n));

    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    static boolean isArmstrongNumber(int n) {
        int original = n;
        int sum = 0;
        while (original > 0) {
            sum += Math.pow(original % 10, 3);
            original /= 10;
        }
        return sum == n;
    }

}
