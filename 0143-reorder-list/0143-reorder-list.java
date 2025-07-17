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
    public static ListNode printmid(ListNode head){
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode mid=printmid(head);
        ListNode secmid=mid.next;
        mid.next=null;
        ListNode curr=secmid,prev=null,next1;
        while(curr!=null){
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        ListNode rh=prev,lh=head,nextl,nextr;
        while(rh!=null && lh!=null){
            nextl=lh.next;
            nextr=rh.next;
            lh.next=rh;
            rh.next=nextl;
            lh=nextl;
            rh=nextr;
        }
      
    }
}