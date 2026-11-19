package space.linuy.leetcode.bank;

public class LC1140 {

    public int stoneGameII(int[] piles) {
        int M = 1;
        boolean isAlice = true;
    }

    private int dynamic(int M, int i, boolean isAlice, int[] piles) {
        int X = 2 * M;
        int max = 0;
        for (int j = i; j <= X + i; j++) {
            int dynamic = dynamic(Math.max(j - i, M), j + i, !isAlice, piles);
            max = Math.max(max, dynamic);
        }
    }
}
