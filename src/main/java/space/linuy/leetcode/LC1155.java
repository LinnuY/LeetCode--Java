package space.linuy.leetcode;

/**
 * 这里有 n 个一样的骰子，每个骰子上都有 k 个面，分别标号为 1 到 k 。
 * 给定三个整数 n ,  k 和 target ，返回可能的方式(从总共 kn 种方式中)滚动骰子的数量，使正面朝上的数字之和等于 target 。
 * 答案可能很大，你需要对 109 + 7 取模 。
 */
public class LC1155 {

    public int numRollsToTarget(int n, int k, int target) {

        int[][] dp = new int[n+1][target+1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                for (int l = 1; l <= k && l <= j; l++) {
                    dp[i][j] += dp[i-1][j-l];
                    dp[i][j] %= 1000000007;
                }
            }
        }
        return dp[n][target];
    }

    public static void main(String[] args) {
        System.out.println(new LC1155().numRollsToTarget(8, 30, 120));
    }


}
