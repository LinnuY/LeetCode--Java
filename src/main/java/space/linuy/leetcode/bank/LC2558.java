package space.linuy.leetcode.bank;

import java.util.PriorityQueue;

/**
 * 给你一个整数数组 gifts ，表示各堆礼物的数量。每一秒，你需要执行以下操作：
 * 选择礼物数量最多的那一堆。
 * 如果不止一堆都符合礼物数量最多，从中选择任一堆即可。
 * 选中的那一堆留下平方根数量的礼物（向下取整），取走其他的礼物。
 * 返回在 k 秒后剩下的礼物数量。
 */
public class LC2558 {

    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> giftQueue = new PriorityQueue<>((a, b) -> b - a);
        for (int gift : gifts) {
            giftQueue.offer(gift);
        }
        for (int i = 0; i < k; i++) {
            int max = giftQueue.poll();
            giftQueue.offer((int) Math.sqrt(max));
        }
        long result = 0;
        for (int gift : giftQueue) {
            result += gift;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LC2558().pickGifts(new int[]{25, 64, 9, 4, 100}, 4));
    }
}
