package Basics;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("Aniket Goyal is my name");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(x);
        sc.close();

        int rollno = 102;
        String rollNoInString = Integer.toString(rollno);
        System.out.println(rollNoInString.getClass());

    }
}