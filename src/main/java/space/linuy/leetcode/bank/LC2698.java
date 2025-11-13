package space.linuy.leetcode.bank;

/**
 * 给你一个正整数 n ，请你返回 n 的 惩罚数 。
 * n 的 惩罚数 定义为所有满足以下条件 i 的数的平方和：
 * 1 <= i <= n
 * i * i 的十进制表示的字符串可以分割成若干连续子字符串，且这些子字符串对应的整数值之和等于 i 。
 */
public class LC2698 {

    public int punishmentNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (isPunishment(i*i, i)) {
                result += i*i;
            }
        }
        return result;
    }

    private Boolean isPunishment(int power, int result) {
        if (power == result) {
            return true;
        }
        if (power/10 <= 0) {
            return false;
        }
        for (int i = 10; i < power; i*=10) {
            if (isPunishment(power % i, result - power / i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new LC2698().punishmentNumber(1000));
    }
}
