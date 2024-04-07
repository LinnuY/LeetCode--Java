package space.linuy.leetcode;

public class LC8 {
    public int myAtoi(String s) {
        s = s.trim();
        int result = 0;
        boolean isNegative = true;
        boolean isChar = false;
        for (char c : s.toCharArray()) {
            if (c == '+' && !isChar) {
                isChar = true;
                continue;
            }
            if (c == '-' && !isChar) {
                isNegative = false;
                isChar = true;
                continue;
            }
            if (c >= '0' && c <= '9') {
                isChar = true;
                if (isNegative && (result > 214748364 || (result == 214748364 && c >= '7'))) {
                    return 2147483647;
                }
                if (!isNegative && (result > 214748364 || (result == 214748364 && c >= '8'))) {
                    return -2147483648;
                }
                result = result * 10 + (c - '0');
            } else {
                break;
            }
        }
        return isNegative ? result : -result;
    }
}
