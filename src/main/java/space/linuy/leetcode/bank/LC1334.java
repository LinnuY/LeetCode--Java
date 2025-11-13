package space.linuy.leetcode.bank;

/**
 * 有 n 个城市，按从 0 到 n-1 编号。给你一个边数组 edges，其中 edges[i] = [fromi, toi, weighti] 代表 fromi 和 toi 两个城市之间的双向加权边，距离阈值是一个整数 distanceThreshold。
 * 返回能通过某些路径到达其他城市数目最少、且路径距离 最大 为 distanceThreshold 的城市。如果有多个这样的城市，则返回编号最大的城市。
 * 注意，连接城市 i 和 j 的路径的距离等于沿该路径的所有边的权重之和。
 */
public class LC1334 {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] distances = new int[n][n];

        for (int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            int weight = edges[i][2];
            distances[from][to] = weight;
            distances[to][from] = weight;
            for (int j = 0; j < n; j++) {

            }
        }
        return 0;
    }
}
