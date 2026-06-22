package space.linuy.leetcode.bank;

import java.util.*;

/**
 * 给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
 * 0 <= a, b, c, d < n
 * a、b、c 和 d 互不相同
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 你可以按 任意顺序 返回答案 。
 */
public class LC18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                for (int h = j + 1; h < nums.length; h++) {
                    if (h != j + 1 && nums[h] == nums[h - 1]) {
                        continue;
                    }
                    for (int k = h + 1; k < nums.length; k++) {
                        if (k != h + 1 && nums[k] == nums[k - 1]) {
                            continue;
                        }
                        if ((long) nums[i] + (long) nums[j] + (long) nums[h] + (long) nums[k] == (long) target) {
                            List<Integer> integerList = Arrays.asList(nums[i], nums[j], nums[h], nums[k]);
                            resultSet.add(integerList);
                        }
                    }
                }
            }
        }

        return resultSet.stream().toList();
    }

    public static void main(String[] args) {
        System.out.println(new LC18().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }
}
