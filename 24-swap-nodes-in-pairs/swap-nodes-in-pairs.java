/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head; //dummy->1->2->3->4

        ListNode prev=dummy; //both prev and dummy point to the same node

        while(prev.next!=null && prev.next.next!=null){// first & second not null
            ListNode first=prev.next;
            ListNode second=first.next;

            //swap first and second
            first.next=second.next;
            second.next=first;

            prev.next=second; //prev is basically the node that was before first. So that should now point to second now.


            prev=first; //making prev as the first node, so that it acts as prev node for the next first node of the next pair
        }
        return dummy.next; //basically the first node which is now head
    }
}