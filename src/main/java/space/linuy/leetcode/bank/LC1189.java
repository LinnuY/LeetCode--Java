package space.linuy.leetcode.bank;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 */
public class LC1189 {

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> ballonMap = new HashMap<>();
        ballonMap.put('a', 1);
        ballonMap.put('b', 1);
        ballonMap.put('l', 2);
        ballonMap.put('o', 2);
        ballonMap.put('n', 1);

        int min = Integer.MAX_VALUE;
        Map<Character, Integer> textMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (textMap.containsKey(c)) {
                textMap.put(c, textMap.get(c) + 1);
            } else {
                textMap.put(c, 1);
            }
        }

        for (char c : ballonMap.keySet()) {
            if (!textMap.containsKey(c)) {
                return 0;
            }
            int temp = textMap.get(c) / ballonMap.get(c);
            min = Math.min(temp, min);
        }

        return min;
    }

    public static void main(String[] args) {
        new LC1189().maxNumberOfBalloons("nlaebolko");
    }
}
