package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class ReverseList {

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

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ReverseList r = new ReverseList();
        ListNode l = r.arrayToNode(new int[] { 1, 2, 3, 4, 5 });
        ListNode rr = r.reverseList(l);
        while(rr != null){
            ListNode tmp = rr.next;
            System.out.println(rr.val);
            rr = tmp;
        }
    }

}
