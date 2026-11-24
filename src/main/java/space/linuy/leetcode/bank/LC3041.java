package space.linuy.leetcode.bank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个下标从 0 开始、只包含正整数的数组 nums。
 * 一开始，你可以将数组中任意数量的元素增加至多 1。
 * 修改后，你可以从最终数组中选择一个或者多个元素，并确保这些元素升序排序后是连续的。
 * 比方说，[3, 4, 5] 是连续的，但是 [3, 4, 6] 和 [1, 1, 2, 3] 不是连续的。
 * 请你返回最多可以选出的元素数目。
 */
public class LC3041 {

    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int num : nums) {

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC3041().maxSelectedElements(new int[]{2, 1, 5, 1, 1})); // 3
        System.out.println(new LC3041().maxSelectedElements(new int[]{1, 4, 7, 10})); // 1
    }
}
