package space.linuy.leetcode;

/**
 * 给你一个数组 nums ，请你完成两类查询。
 * 其中一类查询要求 更新 数组 nums 下标对应的值
 * 另一类查询要求返回数组 nums 中索引 left 和索引 right 之间（ 包含 ）的nums元素的 和 ，其中 left <= right
 * 实现 NumArray 类：
 * NumArray(int[] nums) 用整数数组 nums 初始化对象
 * void update(int index, int val) 将 nums[index] 的值 更新 为 val
 * int sumRange(int left, int right) 返回数组 nums 中索引 left 和索引 right 之间（ 包含 ）的nums元素的 和 （即，nums[left] + nums[left + 1], ..., nums[right]）
 */
public class LC307 {

    private final int[] nums;

    public LC307(int[] nums) {
        this.nums = nums;
    }

    public void update(int index, int val) {
        if (index >= nums.length) {
            return;
        }
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += nums[i];
        }
        return result;
    }
}
