package LinkedLists;

public class ReOrderLL {
    public static void reorderList(ListNode head) {
        ListNode slow = head, fast = head , mid , curr = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        mid = slow.next ;
        slow.next = null ;

        mid = reverseList(mid) ;

        while(curr != null && mid != null){
            ListNode temp = curr.next , t = mid.next  ;
            curr.next = mid ;
            mid.next = temp ;
            mid = t ;
            curr = temp ;
        }
        
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode n = new ListNode(head.val);
            n.next = prev;
            prev = n;
            head = head.next;
        }

        return prev;
    }

    public static void main(String[] args) {
        reorderList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
    }
}
