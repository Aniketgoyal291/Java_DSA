package Basics;

import java.util.Scanner;

public class repeatedDigitInNumber {

    public static void main(String[] args) {

        long a = 2313524333312351l;

        int count = 0;
        while (a > 0) {
            int digit = (int) a % 10;
            if (digit == 3) {
                count += 1;
            }
            a = a / 10;
        }

        System.out.println(count);

    }
}
