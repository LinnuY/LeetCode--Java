package space.linuy.leetcode;


import java.util.Scanner;

/**
 * 给你一个正整数 n ，请你计算在 [1，n] 范围内能被 3、5、7 整除的所有整数之和。
 * 返回一个整数，用于表示给定范围内所有满足约束条件的数字之和。
 */
public class LC2652 {

    public int sumOfMultiples(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                total += i;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(new LC2652().sumOfMultiples(7));
    }
}
