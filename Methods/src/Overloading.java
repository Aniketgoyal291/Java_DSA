// 2 or more functions can exist if the parameters are different.

public class Overloading {

    public static void main(String[] args) {

        Overloading obj = new Overloading();
        obj.fun("My name is aniket goyal");
        obj.fun(23);

    }

    void fun(String s){
        System.out.println(s);
    }

    void fun(int i){
        System.out.println(i);
    }

}
