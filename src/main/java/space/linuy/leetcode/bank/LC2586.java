package space.linuy.leetcode.bank;

/**
 * 给你一个下标从 0 开始的字符串数组 words 和两个整数：left 和 right 。
 * 如果字符串以元音字母开头并以元音字母结尾，那么该字符串就是一个 元音字符串 ，其中元音字母是 'a'、'e'、'i'、'o'、'u' 。
 * 返回 words[i] 是元音字符串的数目，其中 i 在闭区间 [left, right] 内
 */
public class LC2586 {

    public int vowelStrings(String[] words, int left, int right) {

        int num = 0;
        for (int i = left; i <= right && i < words.length; i++) {
            if ((words[i].startsWith("a") || words[i].startsWith("o") || words[i].startsWith("e") || words[i].startsWith("i") || words[i].startsWith("u"))
                    && (words[i].endsWith("a") || words[i].endsWith("o") || words[i].endsWith("e") || words[i].endsWith("i") || words[i].endsWith("u"))) {
                num++;
            }
        }
        return num;
    }
}
