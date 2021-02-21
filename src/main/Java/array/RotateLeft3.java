package array;

public class RotateLeft3 {
    public RotateLeft3() {
    }

    public int[] rotateLeft3(int[] nums) {
    int helper1;
    int helper2;
    int helper3;

    helper1 = nums[0];
    helper2 = nums[1];
    helper3 = nums[2];

    nums[0]=helper3;
    nums[1]=helper2;
    nums[2]=helper1;


     return nums;

    }

}
