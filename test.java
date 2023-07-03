public class test {

    void fibonacchi(int length) {

        int first = 0;
        int second = 1;
        int intermediate;
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

        // int a = 2;
        // int b = 3;
        // int exchange = a;
        // a = b;
        // b = exchange;

        // System.out.println(a);
        // System.out.println(b);

        test obj = new test();
        obj.fibonacchi(10);

        System.out.println("aniekt");

    }
}
