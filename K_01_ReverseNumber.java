public class K_01_ReverseNumber {

    void reverseNumber(int num) {
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            reverse = (reverse * 10) + rem;
        }
        System.out.println(reverse);

    }

    public static void main(String[] args) {

        K_01_ReverseNumber obj = new K_01_ReverseNumber();
        obj.reverseNumber(1234);

    }

}
