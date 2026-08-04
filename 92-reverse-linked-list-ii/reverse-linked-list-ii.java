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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
            return head;
        
        int pos=1;
        ListNode start=head;
        ListNode before=null;
        while(pos!=left){
            before=start;
            start=start.next;
            pos++;
        }

        int times=right-left+1;
        ListNode curr=start;
        ListNode prev=null;
        while(times!=0){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            times--;
        }

        start.next=curr;
        if(before!=null){ 
            before.next=prev;
            return head;
        }
        return prev; //when left=1, before will be null
    }
}