// Shadowing is the practice of using 2 variables of the same name within the
// scope that overlaps.
// Shadowing only works in class variables and does not work in method var.
public class Shadowing {

    static int x = 10; // It will be available everywhere in the scope of
    // Shadowing block, i.e. it's parenthesis.

    public static void main(String[] args) {

        System.out.println(x);
        int x = 100;
        System.out.println("Now, the first x is overshadowed by this x.");
        System.out.println(x);
        fun();

    }

    static void fun(){
        System.out.println(x);
    }

}


// When we add another variable with the same name inside overlapping scope,
// the variable with the higher level scope is hidden.