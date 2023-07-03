import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Type conversion can only happend when the left hand side data type
        // is greater than the right side data type.
        // float num = 23.31f;

        // type casting
        // int intNum = (int) num;

        // Automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte) a; // 257%256 = 1;
        // System.out.println(b);

        // byte x = 40;
        // byte y = 50;
        // byte z = 100;
        // int c = x * y / z; // The type is converted to int.
        // Whenever we multiply 2 bytes, automatically converts into int.
        // byte k = x*y;  ---> will give error.
        // System.out.println(c); 

        // int number = 'A'; // ASCI Value

        // byte b = 42;
        // char c = 'a';
        // short s = 1024;
        // int i = 50000;
        // float f = 5.67f;
        // double d = 0.1234;
        // double result = (f * b) + (i / c) - (d - s);
        // System.out.println((f * b) + " " + (i / c) + " " + +(d - s));
        // System.out.println(result);

        sc.close();

    }
}