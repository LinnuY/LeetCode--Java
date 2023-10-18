package space.linuy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。
 * 你必须设计并实现线性时间复杂度的算法且仅使用常量额外空间来解决此问题。
 */
public class LC260 {

    public int[] singleNumber(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (result.contains(num)) {
                result.remove((Integer) num);
            } else {
                result.add(num);
            }
        }
        int[] numList = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            numList[i] = result.get(i);
        }
        return numList;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LC260().singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }
}
