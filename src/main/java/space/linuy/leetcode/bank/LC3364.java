package space.linuy.leetcode.bank;

import java.util.List;

public class LC3364 {

    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int result = -1;
        int i = 0, j = 0;
        int sum = 0;
        for (; i < nums.size() - l; i++) {
            while (j <= i + l) {
                sum += nums.get(j);
                j++;
            }
            if (sum > 0 && result == -1) {
                result = sum;
            }
            if (sum > 0 && sum < result) {
                result = sum;
            }
            while (j <= i + r) {
                sum += nums.get(j);
                if (sum > 0 && result == -1) {
                    result = sum;
                }
                if (sum > 0 && sum < result) {
                    result = sum;
                }
                j++;
            }
        }
        return result;
    }
}
