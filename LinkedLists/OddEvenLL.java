package LinkedLists;


public class OddEvenLL {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }
        ListNode  odd = head , even = head.next , oddRes = head, evenRes = even ;

        while(head != null && head.next != null){
            head = odd.next ;
            
            if(odd.next != null && odd.next.next != null){
                odd.next = odd.next.next ;
                odd = odd.next ;
            }else{
                odd.next = null ;
            }
            
            if(even.next != null && even.next.next != null){
                even.next = even.next.next ;
                even = even.next ;
            }else {
                even.next = null;
            }

        }

        odd.next = evenRes ;

        return oddRes ;
    }

    public static void main(String[] args) {
        ListNode ll1 = new ListNode(1, new ListNode(2,new ListNode(3, new ListNode(4, new ListNode(5))))) ;

        oddEvenList(ll1) ;

    }
}
