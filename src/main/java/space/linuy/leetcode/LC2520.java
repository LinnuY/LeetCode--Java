package space.linuy.leetcode;

/**
 * 给你一个整数 num ，返回 num 中能整除 num 的数位的数目。
 * 如果满足 nums % val == 0 ，则认为整数 val 可以整除 nums 。
 */
public class LC2520 {

    public int countDigits(int num) {
        int head = num;
        int count = 0;
        while (num > 0) {
            if (head % (num % 10) == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new LC2520().countDigits(121));
    }
}
