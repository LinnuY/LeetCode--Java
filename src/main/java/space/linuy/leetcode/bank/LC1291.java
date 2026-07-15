package space.linuy.leetcode.bank;

import java.util.ArrayList;
import java.util.List;

/**
 * 我们定义「顺次数」为：每一位上的数字都比前一位上的数字大 1 的整数。
 * 请你返回由 [low, high] 范围内所有顺次数组成的 有序 列表（从小到大排序）。
 */
public class LC1291 {

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> resultList = new ArrayList<>();
        int first = minDigits(low);
        do {
            if (first >= low && first <= high) {
                resultList.add(first);
            }
            first = getNext(first);
        } while (first >= low && first <= high);
        return resultList;
    }

    private int minDigits(int low) {
        int n = 0;
        int m = 0;
        while (low > 0) {
            m = low % 10;
            low = low / 10;
            n++;
        }
        int result = m;
        for (int i = 0; i < n - 1; i++) {
            if (m + i + 1 >= 10) {
                result = 1;
                for (int j = 0; j < n; j++) {
                    result = result * 10 + 2 + j;
                }
                return result;
            }
            result = result * 10 + m + i + 1;
        }
        return result;
    }

    private int getNext(int low) {
        int temp = 1;
        int n = 0;
        int result = low;
        while (low / 10 > 0) {
            low /= 10;
            temp = temp * 10 + 1;
            n++;
        }
        result = result + temp;
        if (result % 10 == 0) {
            result = 1;
            for (int i = 0; i < n + 1; i++) {
                result = result * 10 + 2 + i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC1291().sequentialDigits(8511, 23553));
    }
}
