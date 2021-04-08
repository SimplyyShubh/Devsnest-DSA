
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode res = head;

        while(l1 != null && l2 != null){
            ListNode n = new ListNode();

            if(l1.val <= l2.val){
                n.val = l1.val; 
                l1 = l1.next ;
            }

            else{
                n.val = l2.val;
                l2 = l2.next;
            }     

            res.next = n ;
            res = res.next ; 
        }

        while(l1 != null){
            ListNode n = new ListNode(l1.val);
            res.next = n ;

            res = res.next ;
            l1 = l1.next ;
        }
        while (l2 != null) {
            ListNode n = new ListNode(l2.val);
            res.next = n;

            res = res.next;
            l2 = l2.next;
        }

        return head.next ;
    }

    public static void main(String[] args) {


    }
}
