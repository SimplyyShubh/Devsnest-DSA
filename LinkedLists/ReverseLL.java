package LinkedLists;

public class ReverseLL {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode temp = head.next ;
            head.next = prev ;
            prev = head ;
            head = temp ;
        }

        return prev ;
    }

    public static ListNode reverse(ListNode h) {
        if(h == null){
            return null ;
        }

        h.next = reverse(h.next) ;
        
        return new ListNode() ;
    }
}
