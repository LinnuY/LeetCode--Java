package space.linuy.leetcode;

public class LC10 {
    public boolean isMatch(String s, String p) {
        int i, j;
        for (i = 0, j = 0; i < s.length() && j < p.length();) {
            if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.' || p.charAt(j) == '*') {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                    i++;
                    j++;
                } else {
                    if (p.charAt(j - 1) == s.charAt(i) || p.charAt(j - 1) == '.') {
                        i++;
                    } else if (p.charAt(j + 1) == s.charAt(i) || p.charAt(j + 1) == '.') {
                        i++;
                        j += 2;
                    } else {
                        return false;
                    }
                }
            } else {
                j++;
                if (p.charAt(j) == '*') {
                    j++;
                }
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        System.out.println(new LC10().isMatch("aab", "c*a*b"));
    }
}
