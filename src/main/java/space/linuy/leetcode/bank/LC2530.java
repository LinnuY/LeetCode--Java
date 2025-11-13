package space.linuy.leetcode.bank;

/**
 * 给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。你的 起始分数 为 0 。
 * 在一步 操作 中：
 * 1. 选出一个满足 0 <= i < nums.length 的下标 i ，
 * 2. 将你的 分数 增加 nums[i] ，并且
 * 3. 将 nums[i] 替换为 ceil(nums[i] / 3) 。
 * 返回在 恰好 执行 k 次操作后，你可能获得的最大分数。
 * 向上取整函数 ceil(val) 的结果是大于或等于 val 的最小整数。
 */
public class LC2530 {

    public long maxKElements(int[] nums, int k) {
        stacking(nums);
        long total = 0;
        for (int i = 0; i < k; i++) {
            total += nums[0];
            nums[0] = (nums[0] + 2) / 3;
            sink(nums, 0);
        }
        return total;
    }

    public void stacking(int[] nums) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            sink(nums, i);
        }
    }

    public void sink(int[] nums, int index) {
        int length = nums.length;
        int leftNode = index * 2 + 1;
        int rightNode = leftNode + 1;

        if (leftNode >= length) return;
        if (nums[leftNode] > nums[index]) {
            swap(nums, index, leftNode);
            sink(nums, leftNode);
        }
        if (rightNode >= leftNode) return;
        if (nums[rightNode] > nums[index]) {
            swap(nums, index, rightNode);
            sink(nums, rightNode);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(new LC2530().maxKElements(new int[]{1, 10, 3, 3, 3}, 3));
    }
}
