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
    public ListNode rotateRight(ListNode head, int k) {
        //k=k%n when k>n
        //last.next=head
        //(n-k).next=null
        //(n-k+1).next=head

        if(head==null)
            return head;

        int n=1;
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
            n++;
        }
        k=k%n;
        if(k==0)
            return head;
        
        //calculating (n-k)th node
        ListNode temp=head;
        int count=1;
        while(count!=(n-k)){
            temp=temp.next;
            count++;
        }
        //calculating (n-k+1)th node
        ListNode res=temp.next;

        last.next=head;
        temp.next=null;
        return res;

    }
}