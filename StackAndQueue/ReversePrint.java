package StackAndQueue;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class ReversePrint {

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode pointer = head;
        while (head != null) {
            stack.push(pointer);
            pointer = pointer.next;
        }
        int length = stack.size();
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }

    public static void main(String[] args) {
        ReversePrint r = new ReversePrint();
        ListNode l = {};
        r.reversePrint(l);
    }
}
