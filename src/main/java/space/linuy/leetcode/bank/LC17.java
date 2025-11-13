package space.linuy.leetcode.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC17 {
    public class MultiNodeTree {
        public List<MultiNodeTree> children;
        public Character ch;

        public MultiNodeTree(Character ch) {
            this.ch = ch;
        }
    }

    public List<String> letterCombinations(String digits) {
        String[] nums = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        MultiNodeTree multiNodeTreeHead = new MultiNodeTree(null);
        for (int i = 0; i < digits.length(); i++) {
            addTreeNode(multiNodeTreeHead, nums[digits.charAt(i) - '0']);
        }
        for (MultiNodeTree node : multiNodeTreeHead.children) {
            result.addAll(dfs(node, ""));
        }
        return result;
    }

    public void addTreeNode(MultiNodeTree multiNodeTree, String num) {
        if (multiNodeTree.children == null) {
            multiNodeTree.children = new ArrayList<>();
            for (int i = 0; i < num.length(); i++) {
                multiNodeTree.children.add(new MultiNodeTree(num.charAt(i)));
            }
        } else {
            for (int i = 0; i < multiNodeTree.children.size(); i++) {
                addTreeNode(multiNodeTree.children.get(i), num);
            }
        }
    }

    public List<String> dfs(MultiNodeTree multiNodeTree, String result) {
        if (multiNodeTree.children == null) {
            return Collections.singletonList(result + multiNodeTree.ch);
        } else {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < multiNodeTree.children.size(); i++) {
                list.addAll(dfs(multiNodeTree.children.get(i), result +  multiNodeTree.ch));
            }
            return list;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LC17().letterCombinations("2379"));
    }
}
