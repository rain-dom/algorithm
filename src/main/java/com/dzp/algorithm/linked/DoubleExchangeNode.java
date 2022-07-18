package com.dzp.algorithm.linked;//给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
// 
//
// 示例 2： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 100] 内 
// 0 <= Node.val <= 100 
// 
// Related Topics 递归 链表 👍 1465 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.WeakHashMap;

// 两两交换节点
class DoubleExchangeNode {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 虚拟头结点，用prev作为条件while，那么就把握住这个不变点
    public ListNode swapPairs(ListNode head) {
        ListNode dumyNode = new ListNode(0);
        dumyNode.next = head;
        ListNode prev = dumyNode;
        while (prev.next != null && prev.next.next != null) {
            ListNode temp = prev.next.next;
            prev.next.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
            prev = temp.next;
        }
        return dumyNode.next;
    }

    // 递归
    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
