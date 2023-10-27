package space.linuy.leetcode;

import java.util.Arrays;

/**
 * 矩形蛋糕的高度为 h 且宽度为 w，给你两个整数数组 horizontalCuts 和 verticalCuts，其中：
 *  horizontalCuts[i] 是从矩形蛋糕顶部到第  i 个水平切口的距离
 * verticalCuts[j] 是从矩形蛋糕的左侧到第 j 个竖直切口的距离
 * 请你按数组 horizontalCuts 和 verticalCuts 中提供的水平和竖直位置切割后，请你找出 面积最大 的那份蛋糕，并返回其 面积 。由于答案可能是一个很大的数字，因此需要将结果 对 109 + 7 取余 后返回。
 */
public class LC1465 {

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        long maxH = 0L;
        Arrays.sort(horizontalCuts);
        for (int i = 0; i < horizontalCuts.length; i++) {
            if (i == 0) {
                maxH = horizontalCuts[i];
            } else {
                maxH = Math.max(maxH, horizontalCuts[i] - horizontalCuts[i - 1]);
            }
        }
        maxH = Math.max(maxH, h - horizontalCuts[horizontalCuts.length - 1]);

        long maxW = 0L;
        Arrays.sort(verticalCuts);
        for (int i = 0; i < verticalCuts.length; i++) {
            if (i == 0) {
                maxW = verticalCuts[i];
            } else {
                maxW = Math.max(maxW, verticalCuts[i] - verticalCuts[i - 1]);
            }
        }
        maxW = Math.max(maxW, w - verticalCuts[verticalCuts.length - 1]);

        return (int) (maxW * maxH % 1000000007);
    }

    public static void main(String[] args) {
        System.out.println(new LC1465().maxArea(1000000000, 1000000000, new int []{2}, new int []{2}));
    }
}
