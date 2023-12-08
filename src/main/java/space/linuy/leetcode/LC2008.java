package space.linuy.leetcode;

import java.util.Arrays;
import java.util.Comparator;

// todo 效率存在问题, 待后续修复
public class LC2008 {

    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides, Comparator.comparingInt(o -> o[1]));
        int max = 0;
        for (int i = rides.length - 1; i >= 0; i--) {
            max = Math.max(dp(rides, i), max);
        }
        return max;
    }

    private int dp(int[][] rides, int e) {
        int max = countTip(rides, e);
        if (e == 0) {
            return max;
        }
        for (int i = e - 1; i >= 0; i--) {
            if (rides[i][1] > rides[e][0]) {
                continue;
            }
            max = Math.max(max, countTip(rides, e) + dp(rides, i));
        }
        return max;
    }

    private int countTip(int[][] rides, int n) {
        return rides[n][1] - rides[n][0] + rides[n][2];
    }

    public static void main(String[] args) {
        System.out.println(new LC2008().maxTaxiEarnings(5, new int[][]{{1,6,1},{3,10,2},{10,12,3},{11,12,2},{12,15,2},{13,18,1}}));
        System.out.println(new LC2008().maxTaxiEarnings(5, new int[][]{{2,5,4},{1,5,1}}));
    }
}
