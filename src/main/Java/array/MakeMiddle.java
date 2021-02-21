package array;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        if(nums.length==2)return
        nums;
        int [] array = new int[2];

        array[0] = nums[(nums.length/2)-1];
        array[1] = nums[(nums.length/2)];

        return array;

    }

}
