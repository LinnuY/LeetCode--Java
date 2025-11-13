package space.linuy.leetcode;

/**
 * 给你一个 二进制字符串 s。
 *
 * 你可以对这个字符串执行 任意次 下述操作：
 *
 * 选择字符串中的任一下标 i（ i + 1 < s.length ），该下标满足 s[i] == '1' 且 s[i + 1] == '0'。
 * 将字符 s[i] 向 右移 直到它到达字符串的末端或另一个 '1'。例如，对于 s = "010010"，如果我们选择 i = 1，结果字符串将会是 s = "000110"。
 * 返回你能执行的 最大 操作次数。
 */
public class LC3228 {

    public int maxOperations(String s) {
        char[] arr = s.toCharArray();
        int result = 0;

        int oneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                oneCount++;
                continue;
            }
            if (arr[i] == '0' && i != 0 && arr[i - 1] == '1') {
                result += oneCount;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "1001101";
        System.out.println(new LC3228().maxOperations(s));
    }
}
