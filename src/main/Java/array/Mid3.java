package array;

public class Mid3 {
    public int[] midThree(int[] nums) {


        int[] array = new int[3];
        array[0] = nums[nums.length / 2 - 1];
        array[1] = nums[nums.length / 2];
        array[2] = nums[nums.length / 2 + 1];

        return array;
    }

}
