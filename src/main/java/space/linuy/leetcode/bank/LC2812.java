package space.linuy.leetcode.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个下标从 0 开始、大小为 n x n 的二维矩阵 grid ，其中 (r, c) 表示：
 * 如果 grid[r][c] = 1 ，则表示一个存在小偷的单元格
 * 如果 grid[r][c] = 0 ，则表示一个空单元格
 * 你最开始位于单元格 (0, 0) 。在一步移动中，你可以移动到矩阵中的任一相邻单元格，包括存在小偷的单元格。
 * 矩阵中路径的 安全系数 定义为：从路径中任一单元格到矩阵中任一小偷所在单元格的 最小 曼哈顿距离。
 * 返回所有通向单元格 (n - 1, n - 1) 的路径中的 最大安全系数 。
 * 单元格 (r, c) 的某个 相邻 单元格，是指在矩阵中存在的 (r, c + 1)、(r, c - 1)、(r + 1, c) 和 (r - 1, c) 之一。
 * 两个单元格 (a, b) 和 (x, y) 之间的 曼哈顿距离 等于 | a - x | + | b - y | ，其中 |val| 表示 val 的绝对值。
 */
public class LC2812 {
    List<Thief> thiefList;
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        thiefList = new ArrayList<>();

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                if (grid.get(i).get(j) == 1) {
                    Thief thief = new Thief(i, j);
                    thiefList.add(thief);
                }
            }
        }
        return bfs(grid, 0, 0, Integer.MAX_VALUE);
    }

    int bfs(List<List<Integer>> grid, int i, int j, int min) {
        if (grid.get(i).get(j) == 1) {
            return 0;
        }
        int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
        int manhattanDistance = Math.min(minManhattanDistance(i, j), min);
        if (i + 1 < grid.size()) {
            left = bfs(grid, i + 1, j, manhattanDistance);
        }
        if (j + 1 < grid.get(i).size()) {
            right = bfs(grid, i, j + 1, manhattanDistance);
        }
        if (i + 1 == grid.size() && j + 1 == grid.size()) {
            return manhattanDistance;
        }
        return Math.max(left, right);
    }

    int minManhattanDistance(int x, int y) {
        return thiefList.stream().mapToInt(thief -> thief.manhattanDistance(x, y)).min().orElse(0);
    }

    private static class Thief {
        int x;
        int y;

        public Thief(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int manhattanDistance(int x, int y) {
            return Math.abs(this.x - x) + Math.abs(this.y - y);
        }
    }
}
