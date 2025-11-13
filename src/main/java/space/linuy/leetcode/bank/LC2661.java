package space.linuy.leetcode.bank;

/**
 *给你一个下标从 0 开始的整数数组 arr 和一个 m x n 的整数 矩阵 mat 。arr 和 mat 都包含范围 [1，m * n] 内的 所有 整数。
 * 从下标 0 开始遍历 arr 中的每个下标 i ，并将包含整数 arr[i] 的 mat 单元格涂色。
 * 请你找出 arr 中在 mat 的某一行或某一列上都被涂色且下标最小的元素，并返回其下标 i 。
 */
public class LC2661 {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] list = new int[m*n+1][2];
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                list[mat[i][j]] = new int[]{i, j};
            }
        }

        int[] col = new int[m];
        int[] row = new int[n];
        for (int i = 0; i < arr.length; i ++) {
            col[list[arr[i]][0]]++;
            row[list[arr[i]][1]]++;
            if (col[list[arr[i]][0]] == n || row[list[arr[i]][1]] == m) {
                return i;
            }
        }
        return -1;
    }

}
