package space.linuy.leetcode;

public class LC7 {
    public int reverse(int x) {
        if (x == -2147483648) {
            return 0;
        }
        boolean flag = x >= 0;
        int result = 0;
        if (!flag) {
            x = -x;
        }
        while (x >= 10) {
            result = result * 10 + (x % 10);
            x = x / 10;
        }
        if ((result == 214748364 && x > 8) || result >= 214748365) {
            return 0;
        }
        result = result * 10 + (x % 10);
        return flag ? result : -result;
    }
}
