package LinkedLists;

public class AddTwoNumbersLL {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode res  = new ListNode(-1) , curr = res;

        l1 = reverseList(l1) ;
        l2 = reverseList(l2) ;
        int carry = 0;

        while (l1!=null && l2 != null) {
            int sum = carry + l1.val + l2 .val ;
            carry = sum/10 ;  

            ListNode n = new ListNode(sum%10) ;
            res.next = n ;
            res = res.next ;

            l1 = l1.next ;
            l2 = l2.next ;
        }

        while(l1 != null){
            int sum = carry + l1.val;
            carry = sum / 10;
            
            ListNode n = new ListNode(sum % 10);
            
            res.next = n;
            res = res.next;

            l1 = l1.next ;
        }
        
        while (l2 != null) {
            int sum = carry + l2.val;
            carry = sum / 10;

            ListNode n = new ListNode(sum % 10);

            res.next = n;
            res = res.next;

            l2 = l2.next;
        }

        if(carry!=0){
            ListNode n = new ListNode(carry);
            res.next = n;
            res = res.next;

        }

        return reverseList(curr.next) ;
    }
    
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
      
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode ll1 = new ListNode(5);
        ListNode ll2 = new ListNode(5);

        addTwoNumbers(ll1, ll2) ;

    }

}
