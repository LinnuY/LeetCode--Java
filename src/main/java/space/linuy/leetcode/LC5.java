package space.linuy.leetcode;

public class LC5 {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            String temp1 = dfs(s, i, i);
            String temp2 = dfs(s, i, i + 1);
            result = result.length() > temp1.length() ? result : temp1;
            result = result.length() > temp2.length() ? result : temp2;
        }
        return result;
    }

    String dfs(String s, int begin, int end) {
        if (s.charAt(begin) != s.charAt(end)) {
            return "";
        }
        for (; begin >= 0 && end < s.length(); begin--, end++) {
            if (s.charAt(begin) != s.charAt(end)) {
                return s.substring(begin + 1, end);
            }
        }
        return s.substring(begin + 1, end);
    }
}
