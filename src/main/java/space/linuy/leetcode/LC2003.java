package space.linuy.leetcode;

import java.util.*;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 有一棵根节点为 0 的 家族树 ，总共包含 n 个节点，节点编号为 0 到 n - 1 。给你一个下标从 0 开始的整数数组 parents ，其中 parents[i] 是节点 i 的父节点。由于节点 0 是 根 ，所以 parents[0] == -1 。
 * 总共有 105 个基因值，每个基因值都用 闭区间 [1, 105] 中的一个整数表示。给你一个下标从 0 开始的整数数组 nums ，其中 nums[i] 是节点 i 的基因值，且基因值 互不相同 。
 * 请你返回一个数组 ans ，长度为 n ，其中 ans[i] 是以节点 i 为根的子树内 缺失 的 最小 基因值。
 * 节点 x 为根的 子树 包含节点 x 和它所有的 后代 节点。
 */
public class LC2003 {

    public int[] smallestMissingValueSubtree(int[] parents, int[] nums) {
        Set<Integer> setList = new HashSet<>();
        int[] result = new int[parents.length];
        List<Integer>[] children = new List[parents.length];
        boolean[] isVisited = new boolean[parents.length];
        Arrays.fill(isVisited, false);
        for (int i = 0; i < parents.length; i++) {
            children[i] = new ArrayList<>();
        }
        for (int i = 1; i < parents.length; i++) {
            children[parents[i]].add(i);
        }
        Arrays.fill(result, 1);
        int iNode = -1;
        for (int i = 0; i < parents.length; i++) {
            if (nums[i] == 1) {
                iNode = i;
                break;
            }
        }

        int node = 1;
        while (iNode != -1) {
            dfs(iNode, nums, result, isVisited, children, setList);
            while (setList.contains(node)) {
                node++;
            }
            result[iNode] = node;
            iNode = parents[iNode];
        }

        return result;
    }

    private void dfs(int node, int[] nums, int[] result, boolean[] isVisited, List<Integer>[] children,
                     Set<Integer> setList) {
        if (isVisited[node]) return;
        isVisited[node] = true;
        setList.add(nums[node]);
        for (int child : children[node]) {
            dfs(child, nums, result, isVisited, children, setList);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parentsStr = scanner.nextLine().split(",");
        int[] parents = new int[parentsStr.length];
        for (int i = 0; i < parentsStr.length; i++) {
            parents[i] = Integer.parseInt(parentsStr[i]);
        }
        String[] numsStr = scanner.nextLine().split(",");
        int[] nums = new int[numsStr.length];
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }

        System.out.println(Arrays.toString(new LC2003().smallestMissingValueSubtree(parents, nums)));
    }
}
