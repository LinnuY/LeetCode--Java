package space.linuy.leetcode.bank;

import java.util.Arrays;

/**
 * 给你两个正整数数组 spells 和 potions ，长度分别为 n 和 m ，其中 spells[i] 表示第 i 个咒语的能量强度，potions[j] 表示第 j 瓶药水的能量强度。
 * 同时给你一个整数 success 。一个咒语和药水的能量强度 相乘 如果 大于等于 success ，那么它们视为一对 成功 的组合。
 * 请你返回一个长度为 n 的整数数组 pairs，其中 pairs[i] 是能跟第 i 个咒语成功组合的 药水 数目。
 */
public class LC2300 {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int[] pairs = new int[spells.length];

        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int begin = 0;
            int end = potions.length - 1;
            while (begin <= end) {
                int mid = (begin + end) / 2;
                if ((long) potions[mid] * spells[i] >= success) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
            }
            pairs[i] = potions.length - begin;
        }

        return pairs;

    }
}
