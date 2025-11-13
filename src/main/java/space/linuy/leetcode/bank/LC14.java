package space.linuy.leetcode.bank;

public class LC14 {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = strs.length - 1; i > 0; i--) {
            result = LPS(result, strs[i]);
            if (result.isEmpty()) {
                break;
            }
        }
        return result;
    }

    private String LPS(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb.append(str1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
