package space.linuy.leetcode.bank;

public class LC11 {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int result = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, result);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
