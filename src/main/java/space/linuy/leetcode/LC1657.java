package space.linuy.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 如果可以使用以下操作从一个字符串得到另一个字符串，则认为两个字符串 接近 ：
 *
 * 操作 1：交换任意两个 现有 字符。
 * 例如，abcde -> aecdb
 * 操作 2：将一个 现有 字符的每次出现转换为另一个 现有 字符，并对另一个字符执行相同的操作。
 * 例如，aacabb -> bbcbaa（所有 a 转化为 b ，而所有的 b 转换为 a ）
 * 你可以根据需要对任意一个字符串多次使用这两种操作。
 *
 * 给你两个字符串，word1 和 word2 。如果 word1 和 word2 接近 ，就返回 true ；否则，返回 false 。
 */
public class LC1657 {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        var length = word1.length();

        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            word1Map.put(word1.charAt(i), word1Map.getOrDefault(word1.charAt(i), 0) + 1);
            word2Map.put(word2.charAt(i), word2Map.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (!word1Map.keySet().equals(word2Map.keySet())) {
            return false;
        }

        return Arrays.equals(word1Map.values().stream().sorted().toArray(), word2Map.values().stream().sorted().toArray());
    }

}
