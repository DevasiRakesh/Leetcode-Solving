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
    public boolean isPalindrome(ListNode head) {
        // 1.finding firsthalf mid in linked list
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode fstHfMid=slow;
        ListNode curr=slow.next,prev=null,next1;
        slow.next=null;
        //2.reverse sec half linked list 
        while(curr!=null){
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        ListNode lh=head,rh=prev;
        // 3. checking lh and rh in linked list
        while(lh!=null && rh!=null){
            if(lh.val!=rh.val){return false;}
            lh=lh.next;
            rh=rh.next;
        }
        return true;

    }
}