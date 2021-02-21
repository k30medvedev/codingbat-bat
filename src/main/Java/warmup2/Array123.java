package warmup2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Array123 {
    public boolean array123(int[] nums) {


        String check = Arrays.toString(nums);
        StringBuilder stringBuilder = new StringBuilder(check);



        if (check.contains("1,2,3,"))
            return true;
        else return false;


    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        String ch = Arrays.toString(array);
        StringBuilder stringBuilder = new StringBuilder(ch);

    }
}