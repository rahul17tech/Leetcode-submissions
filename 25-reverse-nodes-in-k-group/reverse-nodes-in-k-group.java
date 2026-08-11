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
    public void reverse(ListNode head, int times){
        ListNode curr=head;
        ListNode prev=null;
        while(times!=0){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            times--;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode prev=dummy;

        while(true){
            ListNode kth=prev;
            for(int i=0;i<k;i++){
                kth=kth.next;

                if(kth==null)
                    return dummy.next;
            }
            ListNode nextGrpFirst=kth.next;

            //reverse
            ListNode grpFirst=prev.next;
            reverse(grpFirst,k);

            grpFirst.next=nextGrpFirst;
            prev.next=kth;

            prev = grpFirst;

        }
    }
}