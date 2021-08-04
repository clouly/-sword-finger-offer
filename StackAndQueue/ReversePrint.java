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

    public ListNode arrayToNode(int[] arr) {
        ListNode head = new ListNode(arr[0]); // 把数组的第一个位置定义为头结点
        ListNode other = head; // 一个指针，此时指向头结点
        for (int i = 1; i < arr.length; i++) { // 头结点已经定义，从1开始
            ListNode temp = new ListNode(arr[i]);
            other.next = temp;
            other = other.next;
        }
        return head;
    }

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode pointer = head;
        while (pointer != null) {
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
        ListNode l = r.arrayToNode(new int[]{1,3,2});
        int[] rr = r.reversePrint(l);
        for (int i : rr) {
            System.out.println(i);
        }
        
    }
}
