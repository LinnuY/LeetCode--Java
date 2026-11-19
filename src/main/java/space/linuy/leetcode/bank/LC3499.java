package space.linuy.leetcode.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个长度为 n 的二进制字符串 s，其中：
 * '1' 表示一个 活跃 区段。
 * '0' 表示一个 非活跃 区段。
 * 你可以执行 最多一次操作 来最大化 s 中的活跃区段数量。在一次操作中，你可以：
 * 将一个被 '0' 包围的连续 '1' 区块转换为全 '0'。
 * 然后，将一个被 '1' 包围的连续 '0' 区块转换为全 '1'。
 * 返回在执行最优操作后，s 中的 最大 活跃区段数。
 * 注意：处理时需要在 s 的两侧加上 '1' ，即 t = '1' + s + '1'。这些加上的 '1' 不会影响最终的计数。
 *
 *
 */
public class LC3499 {

    public int maxActiveSectionsAfterTrade(String s) {
        List<Integer> nodeList = new ArrayList<>();
        nodeList.add(0);
        int i = 1;
        for (char c : s.toCharArray()) {
            if ()
        }
    }
}
