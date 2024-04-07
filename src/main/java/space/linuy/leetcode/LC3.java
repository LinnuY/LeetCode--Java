package space.linuy.leetcode;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        int begin = 0, end;
        int result = 0;
        for (end = 1; end < s.length(); end++) {
            int j;
            for (j = begin; j < end; j++) {
                if (s.charAt(j) == s.charAt(end)) {
                    break;
                }
            }
            result = Math.max(result, end - begin);
            if (j != end) {
                begin = j + 1;
            }
        }
        result = Math.max(result, end - begin);
        return result;
    }
}
