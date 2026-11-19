package space.linuy.leetcode.bank;

import java.util.ArrayList;
import java.util.List;

public class LC22 {

    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        String string = "(";
        int left = 1;
        int right = 0;
        recursion(resultList, string, left, right, n);
        return resultList;
    }

    void recursion(List<String> result, String string, int left, int right, int n) {
        if (right >= n) {
            result.add(string);
        } else {
            if (left >= n) {
                recursion(result, string + ')', left, right + 1, n);
            } else {
                recursion(result, string + '(', left + 1, right, n);
                if (left > right) {
                    recursion(result, string + ')', left, right + 1, n);
                }
            }
        }
    }
}
