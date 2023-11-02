package space.linuy.leetcode;

import java.util.Arrays;

/**
 * 一个公司准备组织一场会议，邀请名单上有 n 位员工。公司准备了一张 圆形 的桌子，可以坐下 任意数目 的员工。
 * 员工编号为 0 到 n - 1 。每位员工都有一位 喜欢 的员工，每位员工 当且仅当 他被安排在喜欢员工的旁边，他才会参加会议。每位员工喜欢的员工 不会 是他自己。
 * 给你一个下标从 0 开始的整数数组 favorite ，其中 favorite[i] 表示第 i 位员工喜欢的员工。请你返回参加会议的 最多员工数目 。
 */
public class LC2127 {

    public int maximumInvitations(int[] favorite) {

        int[] penetrations = new int[favorite.length];
        for (int i : favorite) {
            penetrations[i]++;
        }

        int result = 0;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC2127().maximumInvitations(new int[]{2,2,1,2}));
    }
}
