package LinkedLists;

public class RemoveNfromEnd {
    
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head ;
        int len = 0 ;
        
        while(curr!=null){
            len++ ;
            curr= curr.next ;
        }
        curr = head ;

        if(len == n){
            return head.next ;
        }
        
        for (int i = 1; i < len - n ; i++) {
            curr = curr.next ;
        }
            
        if(curr.next!= null)
            curr.next = curr.next.next ;

        return head ;
    }

    public static void main(String[] args) {
        ListNode ll1 = new ListNode(1);

        removeNthFromEnd(ll1, 1) ;
    }
}
