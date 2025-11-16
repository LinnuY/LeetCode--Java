package space.linuy.leetcode.bank;

import java.util.Scanner;

public class LC1513 {

    public int numSub(String s) {
        long result = 0;
        String[] split = s.split("0+");
        for (String str : split) {
            long num = str.length();
            result += (num * (num + 1) / 2);
        }
        return Math.toIntExact(result % (1000000007));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new LC1513().numSub(str));
    }
}
