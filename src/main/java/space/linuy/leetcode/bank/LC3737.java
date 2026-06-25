package space.linuy.leetcode.bank;

/**
 * 给你一个整数数组 nums 和一个整数 target。
 * 返回数组 nums 中满足 target 是 主要元素 的 子数组 的数目。
 * 一个子数组的 主要元素 是指该元素在该子数组中出现的次数 严格大于 其长度的 一半 。
 * 子数组 是数组中的一段连续且 非空 的元素序列。
 */
public class LC3737 {

    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = i; j < nums.length; j++) {
                if (flag && nums[j] == target) {
                    count++;
                    continue;
                } else if (!flag && nums[j] != target) {
                    continue;
                }
                if (isMainElement(nums, i, j, target)) {
                    count++;
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return count;
    }

    private boolean isMainElement(int[] nums, int i, int j, int target) {
        int count = 0;
        for (int t = i; t <= j; t++) {
            if (nums[t] == target) {
                count++;
            }
        }
        return count > (j - i + 1) / 2;
    }

    public static void main(String[] args) {
        new LC3737().countMajoritySubarrays(new int[] {1,2,2,3}, 2);
    }
}
