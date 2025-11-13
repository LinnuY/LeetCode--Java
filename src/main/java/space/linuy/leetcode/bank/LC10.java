package space.linuy.leetcode.bank;

public class LC10 {
    public boolean isMatch(String s, String p) {
        p = p.replace("***", "*");
        return s.matches(p);
    }

    public static void main(String[] args) {
        System.out.println(new LC10().isMatch("aab", "c*a*b"));
    }
}
