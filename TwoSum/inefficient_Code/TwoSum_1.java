package LeetCode.TwoSum.inefficient_Code;

import java.util.Arrays;

public class TwoSum_1 {
    public static void main(String[] args) {
        int a[]={2,3,4};
        System.out.println(Arrays.toString(twoSum(a, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i<nums.length; i++) {
            for (int j = i; j<nums.length; j++) {
                if (nums[j] + nums[j-i] == target) 
                    return new int[] {j, j-i};
            }
        }
        return null;
    }
}
