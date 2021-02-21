package array;

public class SwapEnds {

    public int[] swapEnds(int[] nums) {


        int helper1 = nums[0];
        int helper2 = nums[nums.length-1];

        nums[0]=helper2;
        nums[nums.length-1]=helper1;

        return nums;

    }

}
