package space.linuy.leetcode.bank;

/**
 * 给你一个字符串数组 patterns 和一个字符串 word ，统计 patterns 中有多少个字符串是 word 的子字符串。返回字符串数目。
 * 子字符串 是字符串中的一个连续字符序列。
 */
public class LC1967 {
    public int numOfStrings(String[] patterns, String word) {
        int result = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                result++;
            }
        }
        return result;
    }
}
