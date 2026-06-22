package space.linuy.leetcode.bank;

import space.linuy.leetcode.common.ListNode;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0, head);
        findNthNode(start, head, n);
        return start.next;
    }

    private int findNthNode(ListNode node, ListNode nextNode, int n) {
        int x = 1;
        if (nextNode.next != null) {
            x = findNthNode(nextNode, nextNode.next, n);
        }
        if (x == n) {
            node.next = nextNode.next;
        }
        return x + 1;
    }

    public static void main(String[] args) {
//        ListNode node5 = new ListNode(5, null);
//        ListNode node4 = new ListNode(4, node5);
//        ListNode node3 = new ListNode(3, node4);
//        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, null);
        new LC19().removeNthFromEnd(node1, 1);
        System.out.println(node1);
    }

}
