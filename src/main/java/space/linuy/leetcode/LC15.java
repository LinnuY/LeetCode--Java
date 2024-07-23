package space.linuy.leetcode;

import java.util.*;

public class LC15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (binarySearch(nums, j + 1, nums.length - 1, -nums[i] - nums[j])) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(-nums[i]-nums[j]);
                    result.add(temp);
                }
            }
        }
        return result;
    }

    private Boolean binarySearch(int[] nums, int begin, int end, int value) {
        if (begin > end) {
            return false;
        }
        if (begin == end && nums[(begin + end) / 2] != value) {
            return false;
        }
        if (nums[(begin + end) / 2] == value) {
            return true;
        }
        return binarySearch(nums, begin, (begin + end) / 2, value) || binarySearch(nums, (begin + end) / 2 + 1, end, value);
    }

    public static void main(String[] args) {
        System.out.println(new LC15().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
