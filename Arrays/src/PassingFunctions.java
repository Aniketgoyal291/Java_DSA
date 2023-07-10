import java.util.Arrays;

public class PassingFunctions {

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 12};

        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        int[][] multiarray = {
                {1, 2, 3},
                {1, 2},
                {1, 2, 3, 4}
        };

    }

    static void change(int[] arr) {
        arr[0] = 99;
    }



}