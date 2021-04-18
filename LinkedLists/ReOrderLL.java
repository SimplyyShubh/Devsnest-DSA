package LinkedLists;

public class ReOrderLL {
    public static void reorderList(ListNode head) {
        ListNode h = head , tail , curr;
        int count = 0 ;

        ListNode prev = null;
        while (head != null) {
            ListNode n = new ListNode(head.val);
            n.next = prev;
            prev = n;
            head = head.next;
            count++ ;
        }
        tail = prev ;
        ListNode res = new ListNode() ;
        curr = res ;
        for (int i = 0; i < count/2; i++) {
            ListNode n = new ListNode(h.val) ;
            ListNode x = new ListNode(tail.val) ;
            curr.next = n ;
            n.next = x ;
            curr = x ;
        }

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
           ListNode n = new ListNode(head.val) ;
           n.next = prev ;
           prev = n ;
           head = head.next ;
        }

        return prev;
    }

    public static void main(String[] args) {
        reorderList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))))) ;
    }
}
