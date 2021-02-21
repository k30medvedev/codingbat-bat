package array;


//Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
//
//        maxEnd3([1, 2, 3]) → [3, 3, 3]
//        maxEnd3([11, 5, 9]) → [11, 11, 11]
//        maxEnd3([2, 11, 3]) → [3, 3, 3]


public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {

        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;

        return nums;


//        if (nums[2] == nums[0]) {
//
//            nums[0] = nums[2];
//            nums[1] = nums[2];
//            return nums;
//        }
//        if (nums[0] > nums[2]) {
//            nums[1] = nums[0];
//            nums[2] = nums[0];
//            return nums;
//        }
//
//        if (nums[2] > nums[0]) {
//
//            nums[0] = nums[2];
//            nums[1] = nums[2];
//            return nums;
//        }
//
//
//        return nums;


    }

}
