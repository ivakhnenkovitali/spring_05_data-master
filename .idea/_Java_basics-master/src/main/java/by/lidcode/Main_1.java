package by.lidcode;

import java.util.Arrays;

public class Main_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums, target));
        System.out.println(Arrays.toString(twoSum(nums,target))); // [0, 1]

        int[] nums1 ={3,2};
        int target1 = 6;
        System.out.println(Arrays.toString(twoSum(nums1,target1))); // [1,2]

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
