package space.linuy.leetcode.bank;

public class LC1524 {

    public int numOfSubarrays(int[] arr) {
        int[] result = new int[arr.length];
        int oddNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] % 2;
            if (result[i] == 1) {
                oddNumber++;
            }
        }
        
    }
}
