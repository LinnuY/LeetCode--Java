package space.linuy.leetcode.bank;

public class LC1437 {
    public boolean kLengthApart(int[] nums, int k) {
        int mid = 0;
        int headOne = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                headOne = i;
                break;
            }
        }
        for (int i = headOne + 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (mid < k) {
                    return false;
                } else {
                    mid = 0;
                }
            } else {
                mid++;
            }
        }
        return true;
    }
}
