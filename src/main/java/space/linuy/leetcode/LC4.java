package space.linuy.leetcode;

public class LC4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numsLength = nums1.length + nums2.length;
        int[] nums = new int[numsLength];
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[i + j] = nums1[i++];
            } else {
                nums[i + j] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            nums[i + j] = nums1[i++];
        }
        while (j < nums2.length) {
            nums[i + j] = nums2[j++];
        }
        if ((numsLength) % 2 == 1) {
            return nums[(numsLength - 1) / 2];
        } else {
            return (nums[(numsLength) / 2] + nums[(numsLength) / 2 - 1]) / 2.0;
        }
    }
}
