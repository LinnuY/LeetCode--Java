package space.linuy.leetcode.bank;

import java.util.Arrays;

public class LC16 {

    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int first = 0; first < nums.length - 2; first++) {
            for (int second = first + 1; second < nums.length - 1; second++) {
                for (int third = second + 1; third < nums.length; third++) {
                    int sum = nums[first] + nums[second] + nums[third];
                    if (Math.abs(sum - target) < Math.abs(result - target)) {
                        result = sum;
                    }
                }
            }
        }

        return result;
    }
}
