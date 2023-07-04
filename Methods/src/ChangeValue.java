import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {

        int[] array = {2,13,4,12};
        changeArr(array);
        System.out.println(Arrays.toString(array));


    }

    static void changeArr(int[] nums){
        nums[0] = 99;
    }

}
