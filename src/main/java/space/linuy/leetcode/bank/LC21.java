package space.linuy.leetcode.bank;

import space.linuy.leetcode.common.ListNode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class LC21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultNodeHead = new ListNode(0, null);
        ListNode temp = resultNodeHead;
        ListNode node1 = list1;
        ListNode node2 = list2;
        while (node1 != null && node2 != null) {
            if (node1.val > node2.val) {
                temp.next = node2;
                node2 = node2.next;
            } else {
                temp.next = node1;
                node1 = node1.next;
            }
            temp = temp.next;
        }
        while (node1 != null) {
            temp.next = node1;
            node1 = node1.next;
            temp = temp.next;
        }
        while (node2 != null) {
            temp.next = node2;
            node2 = node2.next;
            temp = temp.next;
        }
        return resultNodeHead.next;
    }
}
