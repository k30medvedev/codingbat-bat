package warmup2;

public class arrayFront9 {
    public static boolean arrayFront9(int[] nums) {

        boolean b = false;

        int n = 0;
        if (nums.length == 1)
            n = 1;
        if (nums.length == 2)
            n = 2;
        if (nums.length == 3)
            n = 3;
        if (nums.length > 4)
            n = 4;


        for (int i = 0; i < n; i++) {
            if (nums[i] == 9) {
                b = true;
            }
        }

        return b;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 9, 3, 4};
        boolean bol = arrayFront9(array);
        System.out.println(bol);
    }

}

