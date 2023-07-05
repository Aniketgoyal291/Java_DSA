// When we do not know how many inputs we are giving.
// The input will be treated as an array.

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

        add(1,2,"my", "name", "is", "Aniket", "Goyal");
        demo(2,4,2);
        demo("Aniket", "Goyal");
//        demo(); // We cannot run this, it is called as ambiguity in var args.

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void add(int a, int b, String ...v){ // the variable length arg will come at end.
//        System.out.println(Arrays.toString(v));
//        int sum = 0;
//        for(int i = 0; i<v.length; i++){
//            sum += v[i];
//        }
//        return sum;
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

}

