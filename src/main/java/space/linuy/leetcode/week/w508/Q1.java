package space.linuy.leetcode.week.w508;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums，以及两个整数 k 和 mul。
 * 从 nums 中选出 恰好 k 个元素。你可以按照任意顺序逐个处理这些元素。
 * 对于每个被选择的元素，都可以 独立地 选择以下两种操作之一
 * 将该元素的值 加 到总和中；或
 * 将该元素乘以 mul 的 当前 值，并将结果 加 到总和中。
 * 每处理一个被选择的元素后，无论选择哪种操作，mul 都会 减少 1。mul 的当前值可能变为 0 或负数。
 * 返回一个整数，表示可能得到的 最大 总和。
 */
public class Q1 {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long result = 0;
        for (int i = nums.length - 1; i >= 0 && k > 0; i--, k--) {
            if (mul > 0) {
                result += (long) nums[i] * mul;
                mul--;
            } else {
                result += nums[i];
            }
        }
        return result;
    }
}
