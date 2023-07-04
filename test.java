import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        // This is enhanced switch statements, which are much neater to write.
        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("sweet red fruit");
            case "orange" -> System.out.println("Round fruit");
            case "grapes" -> System.out.println("small fruits");
            default -> System.out.println("None of the fruits matched");
        }

        sc.close();

    }
}
