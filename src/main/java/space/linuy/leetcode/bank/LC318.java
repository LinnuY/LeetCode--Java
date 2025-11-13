package space.linuy.leetcode.bank;

/**
 * 给你一个字符串数组 words ，找出并返回 length(words[i]) * length(words[j]) 的最大值，并且这两个单词不含有公共字母。
 * 如果不存在这样的两个单词，返回 0 。
 */
public class LC318 {

    public int maxProduct(String[] words) {

        int max = 0;
        int[] marks = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                marks[i] |=  1 << (c - 'a');
            }
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((marks[i] & marks[j]) == 0) {
                    max = Math.max(words[i].length() * words[j].length(), max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LC318().maxProduct(new String[]{"abcw","baz","foo","bar","xtfn","abcdef"}));
    }
}
