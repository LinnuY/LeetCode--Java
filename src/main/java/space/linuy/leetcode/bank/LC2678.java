package space.linuy.leetcode.bank;

public class LC2678 {

    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 12)) * 10 + Integer.parseInt(detail.substring(12, 13)) > 60) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new LC2678().countSeniors(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"}));
    }
}
