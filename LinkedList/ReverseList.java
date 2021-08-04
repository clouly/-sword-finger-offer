package LinkedList;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class ReverseList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur !=null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        } 
        return cur;
    }

    public static void main(String[] args) {
        
    }
    
}
