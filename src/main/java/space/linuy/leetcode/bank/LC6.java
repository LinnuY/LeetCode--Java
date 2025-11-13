package space.linuy.leetcode.bank;

public class LC6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int length = s.length();
        int groupNum = length / numRows + (length % numRows == 0 ? 0 : 1);
        int numCol = groupNum * (numRows - 1);
        char[][] map = new char[numRows][numCol];
        int sIndex = 0;
        for (int i = 0; i < groupNum; i++) {
            for (int j = 0; j < numRows && sIndex < length; j++) {
                map[j][i * (numRows - 1)] = s.charAt(sIndex++);
            }
            for (int j = numRows - 1, k = 1; j > 1 && sIndex < length; j--, k++) {
                map[j - 1][i * (numRows - 1) + k] = s.charAt(sIndex++);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCol; j++) {
                if (map[i][j] != 0) {
                    result.append(map[i][j]);
                }
            }
        }
        return result.toString();
    }
}
